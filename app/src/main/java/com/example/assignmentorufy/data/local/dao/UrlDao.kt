package com.example.assignmentorufy.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.assignmentorufy.data.local.entity.UrlEntity

@Dao
interface UrlDao {

    @Insert
    suspend fun insertUrl(urlEntity: UrlEntity)

    @Query("SELECT * FROM url_table ORDER BY timestamp DESC")
    suspend fun getAllUrls(): List<UrlEntity>

    @Query("DELETE FROM url_table")
    suspend fun clearAll()
}
