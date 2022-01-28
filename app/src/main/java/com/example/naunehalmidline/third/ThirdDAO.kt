package com.example.naunehalmidline.third

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface ThirdDAO {

    @Insert
  fun insert(third: Third)

    @Update
 fun update(third: Third)

   /* @Delete
    suspend fun delete(third: Third)*/

    @Query("Select * FROM Third")
    fun getcontact() : LiveData<List<Third>>

}