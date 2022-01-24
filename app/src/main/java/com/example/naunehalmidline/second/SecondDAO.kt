package com.example.naunehalmidline.second

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface SecondDAO {

    @Insert
    suspend fun insert(second: Second)

    @Update
    suspend fun update(second: Second)

    @Delete
    suspend fun delete(second: Second)

    @Query("Select * FROM Second")
    fun getcontact() : LiveData<Second>
}