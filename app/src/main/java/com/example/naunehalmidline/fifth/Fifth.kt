package com.example.naunehalmidline.fifth

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Fifth")
data class Fifth(
    @PrimaryKey(autoGenerate = true)
    val id : Long,

    /*val name : String,
    val phone : String,*/
    val pd01 : String,
    val pd02 : String,
    val pd03 : String,
    val pd04 : String,
    val pd05 : String,
    val pd0596 : String,
    val pd06 : String,
    val pd06962 : String,

)