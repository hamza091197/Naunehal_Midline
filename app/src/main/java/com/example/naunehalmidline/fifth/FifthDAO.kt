package com.example.naunehalmidline.fifth

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface FifthDAO {

    @Insert
     fun insert(fifth: Fifth)

    @Update
     fun update(fifth: Fifth)

   /* @Delete
    fun delete(fifth: Fifth)*/

    @Query("Select * FROM Fifth")
    fun getcontact() : LiveData<List<Fifth>>

}