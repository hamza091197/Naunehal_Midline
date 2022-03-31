package com.example.naunehalmidline.main

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.naunehalmidline.Fourth.Fourth
import com.example.naunehalmidline.Fourth.Fourth2
import com.example.naunehalmidline.eight.Eight
import com.example.naunehalmidline.eight.Eight2
import com.example.naunehalmidline.fifth.Fifth
import com.example.naunehalmidline.second.Second
import com.example.naunehalmidline.seven.Seven
import com.example.naunehalmidline.sixth.Sixth
import com.example.naunehalmidline.third.Third

@Dao
interface ContactDAO {

    @Insert
    fun insert(contact: Contact)

    @Update
    fun update(contact: Contact)

    @Insert
    fun insert(eight: Eight)

    @Update
    fun update(eight: Eight)

    @Insert
    fun insert(eight2: Eight2)

    @Update
    fun update(eight2: Eight2)

    @Insert
    fun insert(fifth: Fifth)

    @Update
    fun update(fifth: Fifth)

    @Insert
    fun insert(second: Second)

    @Update
    fun update(second: Second)

    @Insert
    fun insert(seven: Seven)

    @Update
    fun update(seven: Seven)

    @Insert
    fun insert(sixth: Sixth)

    @Update
    fun update(sixth: Sixth)

    @Insert
    fun insert(third: Third)

    @Update
    fun update(third: Third)

    @Insert
    fun insert(fourth: Fourth)

    @Update
    fun update(fourth: Fourth)

    @Insert
    fun insert(fourth2: Fourth2)

    @Update
    fun update(fourth2: Fourth2)

    /*@Delete
    fun delete(contact: Contact)*/

    @Query("Select * FROM Contact")
    fun getcontact() : LiveData<List<Contact>>

}