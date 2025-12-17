package com.example.assignmentorufy.data.remote

import com.example.assignmentorufy.data.local.entity.UrlEntity
import retrofit2.http.Body
import retrofit2.http.POST
import retrofit2.Response


interface ApiService {

    @POST("/upload")
    suspend fun uploadHistory(
        @Body history: List<UrlEntity>
    ): Response<Unit>
}
