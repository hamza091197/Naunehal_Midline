package com.example.naunehalmidline.main

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface ContactDAO {

    @Insert
    fun insert(contact: Contact)

    @Update
    fun update(contact: Contact)

    /*@Delete
    fun delete(contact: Contact)*/

    @Query("Select * FROM Contact")
    fun getcontact() : LiveData<List<Contact>>

}