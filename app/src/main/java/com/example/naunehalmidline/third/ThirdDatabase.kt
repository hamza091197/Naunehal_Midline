package com.example.naunehalmidline.third

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Third::class], version = 1)
abstract class ThirdDatabase : RoomDatabase() {
    abstract fun ThirdDao(): ThirdDAO


    companion object {



        @Volatile
        private var Instance: ThirdDatabase? = null

        fun getDatabase(context: Context): ThirdDatabase {

            if (Instance == null) {

                synchronized(this) {

                    Instance = Room.databaseBuilder(
                        context.applicationContext,
                        ThirdDatabase::class.java,
                        "thirdDB"
                    ).build()

                }


            }

            return Instance!!

        }

    }


}