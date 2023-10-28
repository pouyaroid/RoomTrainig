package com.example.roomtrainig.room

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "table_user")
data class User(
   @PrimaryKey(autoGenerate = true)
    val id:Int,
    val name:String,
    val phoneNumber:String,
    val description:String
)


