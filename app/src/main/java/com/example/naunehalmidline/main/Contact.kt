package com.example.naunehalmidline.main

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Contact")
data class Contact(
    @PrimaryKey(autoGenerate = true)
    val id : Long,

    /*val name : String,
    val phone : String,*/
    val hh01 : String,
    val hh0201 : String,
    val hh0202 : String,
    val hh03 : String,
    val hh04 : String,
    val hh05 : String,
    val hh06 : String,
    val hh07 : String,
    val hh08 : String,
    val hh09: String,
    val hh10: String,
    val hh11 : String,
    val hh12 : String,
    val hh13 : String,
    val hh14 : String,
    val hh15 : String,
    val hh16 : String,
    val hh17 : String,
    val hh1796x : String,
    val hh18 : String,
    val hh19: String,
    val hh20 : String,
    val hh2096x : String,
    val hh21: String,
    val hh22: String,
    val hh23 : String,
    val hh24 : String,
    val hh25 : String,
    val hh26 : String,
    val hh2696x : String
)