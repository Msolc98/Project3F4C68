package com.test.project3f4c68

import android.content.Context
import androidx.room.Dao
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [UserInfo::class],version= 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun userDao():UserDao

    companion object {
        private var instance: RoomDatabase? = null

        @Synchronized
        fun getInstance(context: Context): RoomDatabase? {
            if (instance == null) {
                synchronized(RoomDatabase::class){
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        RoomDatabase::class.java,
                        "singleDatabase"
                    ).build()
                }
            }
            return instance
        }
    }
}