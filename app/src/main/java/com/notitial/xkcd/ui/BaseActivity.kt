package com.notitial.xkcd.ui

import android.annotation.SuppressLint
import android.widget.FrameLayout
import androidx.appcompat.app.AppCompatActivity
import com.notitial.xkcd.R

@SuppressLint("Registered")
open class BaseActivity : AppCompatActivity() {
    override fun setContentView(layoutResID: Int) {
        val constraintLayout = layoutInflater.inflate(R.layout.activity_base, null)
        val frameLayout = constraintLayout.findViewById<FrameLayout>(R.id.frame_content)
        layoutInflater.inflate(layoutResID, frameLayout, true)
        super.setContentView(constraintLayout)
    }
}
