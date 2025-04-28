package com.example.todolist.data

import kotlinx.coroutines.flow.Flow

interface ListingRepository {

    suspend fun insertListing(listingModel: ListingModel)

    suspend fun updateListing(listingModel: ListingModel)

    fun getAllListingsStream (): Flow<List<ListingModel>>

    fun getIncompleteListingsStream (): Flow<List<ListingModel>>
}