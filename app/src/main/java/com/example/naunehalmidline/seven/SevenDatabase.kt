package com.example.naunehalmidline.seven

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Seven::class], version = 1)
abstract class SevenDatabase : RoomDatabase() {
    abstract fun SevenDao(): SevenDAO


    companion object {



        @Volatile
        private var Instance: SevenDatabase? = null

        fun getDatabase(context: Context): SevenDatabase {

            if (Instance == null) {

                synchronized(this) {

                    Instance = Room.databaseBuilder(
                        context.applicationContext,
                        SevenDatabase::class.java,
                        "sevenDB"
                    ).build()

                }


            }

            return Instance!!

        }

    }


}