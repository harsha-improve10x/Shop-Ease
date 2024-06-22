package com.example.shopease

import retrofit2.Call
import retrofit2.http.GET

interface FakeApiService {
    @GET()
    fun fetchCategories(): Call<List<String?>?>?
}