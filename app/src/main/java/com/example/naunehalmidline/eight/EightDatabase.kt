package com.example.naunehalmidline.eight

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Eight::class], version = 1)
abstract class EightDatabase : RoomDatabase() {
    abstract fun EightDao(): EightDAO

    companion object {

        @Volatile
        private var Instance: EightDatabase? = null

        fun getDatabase(context: Context): EightDatabase {

            if (Instance == null) {

                synchronized(this) {

                    Instance = Room.databaseBuilder(
                        context.applicationContext,
                        EightDatabase::class.java,
                        "eightDB"
                    ).build()

                }
            }

            return Instance!!

        }

    }


}