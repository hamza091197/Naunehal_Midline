package com.example.naunehalmidline.eight2

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.naunehalmidline.eight.Eight

@Database(entities = [Eight2::class], version = 1)
abstract class Eight2Database : RoomDatabase() {
    abstract fun Eight2Dao(): Eight2DAO


    companion object {



        @Volatile
        private var Instance: Eight2Database? = null

        fun getDatabase(context: Context): Eight2Database {

            if (Instance == null) {

                synchronized(this) {

                    Instance = Room.databaseBuilder(
                        context.applicationContext,
                        Eight2Database::class.java,
                        "eight2DB"
                    ).build()

                }


            }

            return Instance!!

        }

    }


}