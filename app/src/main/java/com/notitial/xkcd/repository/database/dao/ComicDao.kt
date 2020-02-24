package com.notitial.xkcd.repository.database.dao

import androidx.room.*
import com.notitial.xkcd.model.Comic

@Dao
interface ComicDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun createItem(comic: Comic): Long

    @Query("SELECT * FROM Comic WHERE num = :id")
    suspend fun getItem(id: Int): Comic

    @Query("SELECT * FROM Comic")
    suspend fun getItems(): List<Comic>

    @Update
    suspend fun updateItem(author: Comic)

    @Delete
    suspend fun deleteItem(author: Comic)

    @Query("DELETE FROM Comic")
    suspend fun deleteItems()

}

