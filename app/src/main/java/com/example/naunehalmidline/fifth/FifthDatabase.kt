package com.example.naunehalmidline.fifth

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Fifth::class], version = 1)
abstract class FifthDatabase : RoomDatabase() {
    abstract fun FifthDao(): FifthDAO


    companion object {



        @Volatile
        private var Instance: FifthDatabase? = null

        fun getDatabase(context: Context): FifthDatabase {

            if (Instance == null) {

                synchronized(this) {

                    Instance = Room.databaseBuilder(
                        context.applicationContext,
                        FifthDatabase::class.java,
                        "fifthDB"
                    ).build()

                }


            }

            return Instance!!

        }

    }


}