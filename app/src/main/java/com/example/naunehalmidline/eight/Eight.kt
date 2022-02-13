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
    val se0196: String,
    val se02: String,
    val se0296: String,
    val se03: String,
    val se0396: String,
    val se04: String,
    val se0496: String,
    val se05: String,
    val se0596: String,
    val se06a: String,
    val se07a: String,
    val se08: String,
    val se0896: String,
    val se09: String,
    val se10: String,
    val se1099: String,
    val se11: String,
    val se1196: String,
    val se12: String,
    val se1296: String,
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
    val se1996: String,
    val se20: String,
    val se2096: String,
    val se21: String,
    val se2196: String,
    val se2201: String,
    val se2202: String,
    val se2203: String,
)