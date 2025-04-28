package com.example.todolist.data
import android.content.Context
interface AppContainer{
    val listingsRepository: ListingRepository
}
class AppDataContainer (private val context: Context) : AppContainer{
    override val listingsRepository: ListingRepository by lazy{
        OfflineRepository(ToDoListDatabase.getDatabase(context).itemDao())
    }
}