package com.notitial.xkcd.model

import androidx.annotation.NonNull
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
data class Comic (
    @PrimaryKey(autoGenerate = true)
    @NonNull
    val num: Long,
    val month: String,
    val link: String,
    val year: String,
    val news: String,
    val safeTitle: String,
    val transcript: String,
    val alt: String,
    @NonNull
    val img: String,
    val title: String,
    val day: String
)