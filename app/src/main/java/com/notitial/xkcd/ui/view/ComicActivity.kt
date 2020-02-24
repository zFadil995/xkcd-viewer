package com.notitial.xkcd.ui.view

import android.os.Bundle
import com.notitial.xkcd.R
import com.notitial.xkcd.ui.BaseActivity

class ComicActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_comic)
    }
}
