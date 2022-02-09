package com.example.naunehalmidline.sixth

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface SixthDAO {

    @Insert
     fun insert(sixth: Sixth)

    @Update
     fun update(sixth: Sixth)

   /* @Delete
    fun delete(Sixth: Sixth)*/

    @Query("Select * FROM Sixth")
    fun getcontact() : LiveData<List<Sixth>>

}