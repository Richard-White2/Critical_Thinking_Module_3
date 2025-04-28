package com.example.todolist.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
interface ListingDao {
    @Insert (onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(listingModel: ListingModel)

    @Update(onConflict = OnConflictStrategy.REPLACE)
    suspend fun update (listingModel: ListingModel)

    @Query ("SELECT * from To_Do_List_table ORDER BY listingId ASC")
    fun getListing(): Flow<List<ListingModel>>

    @Query ("SELECT * from To_Do_List_table WHERE done = 0")
    fun getIncompleteListings(): Flow<List<ListingModel>>

}