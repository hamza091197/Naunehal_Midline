package com.example.naunehalmidline.sixth

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Sixth::class], version = 1)
abstract class SixthDatabase : RoomDatabase() {
    abstract fun SixthDao(): SixthDAO


    companion object {



        @Volatile
        private var Instance: SixthDatabase? = null

        fun getDatabase(context: Context): SixthDatabase {

            if (Instance == null) {

                synchronized(this) {

                    Instance = Room.databaseBuilder(
                        context.applicationContext,
                        SixthDatabase::class.java,
                        "sixthDB"
                    ).build()

                }


            }

            return Instance!!

        }

    }


}