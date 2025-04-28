package com.example.todolist.data

import kotlinx.coroutines.flow.Flow

class OfflineRepository(private val listingDao: ListingDao): ListingRepository {
    override suspend fun insertListing(listingModel: ListingModel) = listingDao.insert(listingModel)

    override suspend fun updateListing(listingModel: ListingModel) = listingDao.update(listingModel)

    override fun getAllListingsStream(): Flow<List<ListingModel>> = listingDao.getListing()

    override fun getIncompleteListingsStream(): Flow<List<ListingModel>> = listingDao.getIncompleteListings()
    }