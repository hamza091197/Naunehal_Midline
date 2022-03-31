package com.example.naunehalmidline.third

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Third")
data class Third(
    @PrimaryKey(autoGenerate = true)
    val id : Long,

    /*val name : String,
    val phone : String,*/
    val cs01: String,
    val cs02: String,
    val cs02a: String,
    val cs02b: String,
    val cs03: String,
    val cs04: String,
    val cs05: String,
    val cs06: String,
    val cs07: String,
    val cs07961x: String,
    val cs07962x: String,
    val cs08: String,
    val cs0896x: String,
    val cs08a: String,
    val cs08b: String,
    val cs09: String,
    val cs0996x: String,
    val cs10: String,
    val cs11: String,
    val cs12: String,
    val cs13: String,
    val cs14: String,
    val cs15: String,
    val cs1596x: String,
    val cs16: String,
    val cs17: String,
    val cs17961x: String,
    val cs17962x: String,
    val cs17a: String,
    val cs17b: String,
    val cs18: String,
    val cs1896x: String,
    val cs19: String,
    val cs1996x: String,
    val cs20: String,
    val cs21: String
    )