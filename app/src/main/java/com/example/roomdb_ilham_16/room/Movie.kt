package com.example.roomdb_ilham_16.room

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Movie(
   @PrimaryKey(autoGenerate = true)
    val id: Int,
    val title: String,
    val desc: String
)