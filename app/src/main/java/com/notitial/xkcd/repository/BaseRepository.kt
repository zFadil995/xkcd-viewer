package com.notitial.xkcd.repository

import android.app.Application
import com.notitial.xkcd.repository.database.AppDatabase


open class BaseRepository(application: Application) {
    protected val db = AppDatabase.getAppDataBase(application)
}