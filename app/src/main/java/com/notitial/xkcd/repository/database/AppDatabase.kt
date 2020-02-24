package com.notitial.xkcd.repository.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.notitial.xkcd.model.Comic
import com.notitial.xkcd.repository.database.dao.ComicDao

@Database(
    entities = [Comic::class],
    version = 3
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun comicDao(): ComicDao

    companion object {
        private var INSTANCE: AppDatabase? = null

        fun getAppDataBase(context: Context): AppDatabase {
            if (INSTANCE == null) {
                INSTANCE = Room
                    .databaseBuilder(
                        context.applicationContext,
                        AppDatabase::class.java,
                        "ComicLibrary"
                    )
                    .addMigrations()
                    .build()
            }
            return INSTANCE!!
        }
    }
}
