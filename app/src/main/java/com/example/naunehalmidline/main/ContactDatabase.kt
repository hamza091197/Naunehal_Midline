package com.example.naunehalmidline.main

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.naunehalmidline.Fourth.Fourth
import com.example.naunehalmidline.Fourth.Fourth2
import com.example.naunehalmidline.eight.Eight
import com.example.naunehalmidline.eight.Eight2
import com.example.naunehalmidline.fifth.Fifth
import com.example.naunehalmidline.second.Second
import com.example.naunehalmidline.seven.Seven
import com.example.naunehalmidline.sixth.Sixth
import com.example.naunehalmidline.third.Third

@Database(entities = [Contact::class, Second::class, Third::class, Fourth::class, Fourth2::class,  Fifth::class, Sixth::class,
    Seven::class, Eight::class, Eight2::class ], version = 1)
abstract class ContactDatabase : RoomDatabase() {
    abstract fun ContactDao(): ContactDAO


    companion object {



        @Volatile
        private var Instance: ContactDatabase? = null

        fun getDatabase(context: Context): ContactDatabase {

            if (Instance == null) {

                synchronized(this) {

                    Instance = Room.databaseBuilder(
                        context.applicationContext,
                        ContactDatabase::class.java,
                        "contactDB"
                    ).build()

                }


            }

            return Instance!!

        }

    }


}