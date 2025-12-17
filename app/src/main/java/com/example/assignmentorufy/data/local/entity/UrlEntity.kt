package com.example.assignmentorufy.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "url_table")
data class UrlEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,

    val url: String,

    val timestamp: Long
)
