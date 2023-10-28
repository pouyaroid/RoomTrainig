package com.example.roomtrainig.room

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface UserDao {
    @Insert
    suspend fun insertUser(user: User)
    @Delete
    suspend fun deleteUser(user: User)
    @Query("SELECT * FROM table_user")
    suspend fun getAllUser():List<User>
    @Query("")
    suspend fun deleteAllUser():List<User>
}