package com.example.naunehalmidline.main

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface ContactDAO {

    @Insert
    suspend fun insert(contact: Contact)

    @Update
    suspend fun update(contact: Contact)

    @Delete
    suspend fun delete(contact: Contact)

    @Query("Select * FROM Contact")
    fun getcontact() : LiveData<Contact>
}