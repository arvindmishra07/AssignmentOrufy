package com.example.assignmentorufy.data.local.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.assignmentorufy.data.local.dao.UrlDao
import com.example.assignmentorufy.data.local.entity.UrlEntity

@Database(
    entities = [UrlEntity::class],
    version = 1
)
abstract class AppDatabase : RoomDatabase() {

    abstract fun urlDao(): UrlDao

    companion object {

        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getDatabase(context: Context): AppDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "orufy_db"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}
