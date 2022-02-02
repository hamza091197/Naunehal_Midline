package com.example.naunehalmidline.fifth

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface FifthDAO {

    @Insert
     fun insert(second: Second)

    @Update
     fun update(second: Second)

   /* @Delete
    fun delete(second: Second)*/

    @Query("Select * FROM Second")
    fun getcontact() : LiveData<List<Second>>

}