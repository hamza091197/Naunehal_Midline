package com.example.naunehalmidline.eight2

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface Eight2DAO {

    @Insert
     fun insert(eight2: Eight2)

    @Update
     fun update(eight2: Eight2)

   /* @Delete
    fun delete(fifth: Fifth)*/

    @Query("Select * FROM Eight2")
    fun getcontact() : LiveData<List<Eight2>>

}