package com.example.naunehalmidline.seven

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "seven")
data class Seven(
    @PrimaryKey(autoGenerate = true)
    val id : Long,

    /*val name : String,
    val phone : String,*/
    val cv01a: String,
    val cv0596x: String,
    val cv0696x: String,
    val cv0896x: String,
    val cv0996x: String,
    val cv1096x: String,
    val cv1296x: String,
    val cv1696x: String,
    val cv1896x: String,
    val cv1996x: String,
    val cv2196x: String,
    val cv01: String,
    val cv02: String,
    val cv03: String,
    val cv04: String,
    val cv05: String,
    val cv06: String,
    val cv07: String,
    val cv08: String,
    val cv09: String,
    val cv10: String,
    val cv11: String,
    val cv12: String,
    val cv13: String,
    val cv14: String,
    val cv15: String,
    val cv16: String,
    val cv17: String,
    val cv18: String,
    val cv19: String,
    val cv20: String,
    val cv21: String,
)