package com.example.shopease

import retrofit2.Call
import retrofit2.http.GET

interface FakeApiService {
    @GET(Constants.CATEGORIES_END_POINT)
    suspend fun fetchCategories(): List<String>
}