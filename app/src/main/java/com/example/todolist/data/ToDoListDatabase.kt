package com.example.todolist.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database (entities = [ListingModel::class], version = 1, exportSchema = false)
abstract class ToDoListDatabase : RoomDatabase (){
    abstract  fun itemDao(): ListingDao

    companion object {
        @Volatile
        private var Instance: ToDoListDatabase? = null

        fun getDatabase(context: Context): ToDoListDatabase {
            return Instance ?: synchronized(this) {
                Room.databaseBuilder(context, ToDoListDatabase::class.java, "ToDoList_database")
                    .build()
                    .also { Instance = it }
            }
        }
    }
}