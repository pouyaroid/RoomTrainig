package com.example.roomtrainig.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
@Database(entities = [User::class], version = 1, exportSchema = false)
abstract class MyDatabase:RoomDatabase() {
    abstract fun userDao():UserDao

    companion object {
        @Volatile
        private var INSTANCE: MyDatabase? = null

        fun getDatabase(context: Context): MyDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    MyDatabase::class.java,
                    "my-database-name.db"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}