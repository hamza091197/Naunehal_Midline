package com.example.naunehalmidline.second

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Second::class], version = 1)
abstract class SecondDatabase : RoomDatabase() {
    abstract fun SecondDao(): SecondDAO


    companion object {



        @Volatile
        private var Instance: SecondDatabase? = null

        fun getDatabase(context: Context): SecondDatabase {

            if (Instance == null) {

                synchronized(this) {

                    Instance = Room.databaseBuilder(
                        context.applicationContext,
                        SecondDatabase::class.java,
                        "secondDB"
                    ).build()

                }


            }

            return Instance!!

        }

    }


}