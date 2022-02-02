package com.example.naunehalmidline.fifth

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Second::class], version = 1)
abstract class FifthDatabase : RoomDatabase() {
    abstract fun SecondDao(): SecondDAO


    companion object {



        @Volatile
        private var Instance: FifthDatabase? = null

        fun getDatabase(context: Context): FifthDatabase {

            if (Instance == null) {

                synchronized(this) {

                    Instance = Room.databaseBuilder(
                        context.applicationContext,
                        FifthDatabase::class.java,
                        "secondDB"
                    ).build()

                }


            }

            return Instance!!

        }

    }


}