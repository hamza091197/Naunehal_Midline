package com.example.naunehalmidline.eight

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface EightDAO {

    @Insert
     fun insert(eight: Eight)

    @Update
     fun update(eight: Eight)

   /* @Delete
    fun delete(eight: Eight)*/

    @Query("Select * FROM Eight")
    fun getcontact() : LiveData<List<Eight>>

}