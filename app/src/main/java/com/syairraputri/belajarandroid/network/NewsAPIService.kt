package com.syairraputri.belajarandroid.network

import com.syairraputri.belajarandroid.model.NewsData
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import retrofit2.http.GET

private val BASE_URL = "https://newsapi.org/v2/"

private val retrofit = Retrofit.Builder()
    .addConverterFactory(GsonConverterFactory.create())
    .baseUrl(BASE_URL)
    .build()

interface NewsAPIService {
    @GET("top-headlines?country=id&apiKey=db93a075ca3644d39ed6bd88b9050f1e")
    suspend fun getTopHeadline(): NewsData

    //untuk define API API yang lain
}

object Api {
    val newsAPIService: NewsAPIService by lazy {
        retrofit.create(NewsAPIService::class.java)
    }
}