package com.notitial.xkcd.config

import android.app.Application
import com.notitial.xkcd.BuildConfig

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        initServices()
    }

    private fun initServices() {
        if (BuildConfig.DEBUG) {
            //Stetho.initializeWithDefaults(this)
        }
    }
}