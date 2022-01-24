package com.example.naunehalmidline.second

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Second")
data class Second(
    @PrimaryKey(autoGenerate = true)
    val id : Long,

    /*val name : String,
    val phone : String,*/
    val cb01: String,
    val cb02: String,
    val cb03: String,
    val cb04dd: String,
    val cb04mm: String,
    val cb04yy: String,
    val cb0501: String,
    val cb0502: String,
    val cb06: String,
    val cb15: String,
    val cb17: String,
    val cb07: String,
    val cb08: String,
    val cb09: String,
    val cb16: String,
    val cb10: String,
    val cb11: String,
    val cb12: String,
    val cb13: String,
    val cb14: String,
    val cb1096x: String,
    val cb1496x: String,
)