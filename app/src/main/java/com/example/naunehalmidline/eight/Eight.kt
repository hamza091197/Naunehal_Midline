package com.example.naunehalmidline.eight

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Eight")
data class Eight(
    @PrimaryKey(autoGenerate = true)
    val id : Long,

    /*val name : String,
    val phone : String,*/
    val se01: String,
    val se0196x: String,
    val se02: String,
    val se0296x: String,
    val se03: String,
    val se0396x: String,
    val se04: String,
    val se0496x: String,
    val se05: String,
    val se0596x: String,
    val se06a: String,
    val se07a: String,
    val se08: String,
    val se0896x: String,
    val se09: String,
    val se10: String,
    val se1099x: String,
    val se11: String,
    val se1196x: String,
    val se12: String,
    val se1296x: String,
    val se13: String,
    val se14: String,
    val se15: String,
    val se16: String,
    val se17: String,
    val se1801: String,
    val se1802: String,
    val se1803: String,
    val se1804: String,
    val se1805: String,
    val se1896: String,
    val se19: String,
    val se1996x: String,
    val se20: String,
    val se2096x: String,
    val se21: String,
    val se2196x: String,
    val se2201: String,
    val se2202: String,
    val se2203: String,
)