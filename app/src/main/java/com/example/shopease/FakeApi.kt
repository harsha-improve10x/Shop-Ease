package com.example.shopease

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class FakeApi {

    fun createCategoriesService(): FakeApiService {
        val retrofit: Retrofit = Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        val fakeApiService = retrofit.create(FakeApiService::class.java)
        return fakeApiService
    }
}