package com.example.roomdbdemo

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface UserDao{
@Insert
fun insertAll(vararg user:User)

@Query("SELECT * FROM users")
fun getAll(): List<User>
}