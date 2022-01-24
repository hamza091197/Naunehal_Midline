package com.example.naunehalmidline.main

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Contact::class], version = 1)
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