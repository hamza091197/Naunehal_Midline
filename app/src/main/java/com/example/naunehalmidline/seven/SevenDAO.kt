package com.example.naunehalmidline.seven

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface SevenDAO {

    @Insert
     fun insert(seven: Seven)

    @Update
     fun update(seven: Seven)

   /* @Delete
    fun delete(seven: Seven)*/

    @Query("Select * FROM Seven")
    fun getcontact() : LiveData<List<Seven>>

}