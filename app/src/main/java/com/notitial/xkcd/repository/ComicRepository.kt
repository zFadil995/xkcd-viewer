package com.notitial.xkcd.repository

import android.app.Application
import androidx.lifecycle.MutableLiveData
import com.notitial.xkcd.model.Comic

class ComicRepository(private val application: Application) : BaseRepository(application) {

    private var comics: MutableLiveData<List<Comic>> = MutableLiveData()
    private var comic: MutableLiveData<Comic> = MutableLiveData()

}