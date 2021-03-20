package com.example.roomdbdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.room.Room

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val db = Room.databaseBuilder(
                applicationContext,
                AppDatabase::class.java, "database-name"
        ).allowMainThreadQueries().build()

        db.userDao().insertAll(User(firstName = "chandrababu",lastName = "Boyilla",uid = 1))
        var users = db.userDao().getAll()

        findViewById<TextView>(R.id.firstName).setText(users[0].firstName)
    }
}