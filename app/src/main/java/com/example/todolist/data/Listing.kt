package com.example.todolist.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "To_Do_List_table")
data class ListingModel(
    @PrimaryKey(autoGenerate = true)
    val listingId: Int = 0,
    val date: String,
    val startTime: String,
    val endTime: String,
    val done: Boolean
)