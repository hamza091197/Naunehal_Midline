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
    val pd0596x : String,
    val pd06 : String,
    val pd06961x :String,
    val pd06962x : String,
    val pd07 : String,
    val pd0701x : String,
    val pd08 : String,
    val pd08a : String,
    val pd08a96x : String,
    val pd08b : String,
    val pd08c : String,
    val pd09 : String,
    val pd10 : String,
    val pd1101 : String,
    val pd1102 : String,
    val pd12 : String,
    val pd1296x : String,
    val pd13 : String,
    val pd13961x : String,
    val pd13962x : String,
    val pd14 : String,
    val pd1496x : String,
    val pd15 : String,
    val pd16 : String,
    val pd1696x : String,
    val pd17 : String,
    val pd1701 : String,
    val pd1702 : String,
    val pd1703 : String,
    val pd18 : String,
    val pd19 : String,
    val pd20 : String,
    val pd2096x : String,
    val pd21 : String,
    val pd2101 : String,
    val pd2102 : String,
    val pd2103 : String,
    val pd22 : String,
    val pd23 : String,
    val pd24 : String

)