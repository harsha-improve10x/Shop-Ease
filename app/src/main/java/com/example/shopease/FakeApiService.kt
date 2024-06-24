package com.example.shopease

import com.example.shopease.products.Product
import retrofit2.http.GET
import retrofit2.http.Path


interface FakeApiService {
    @GET(Constants.CATEGORIES_END_POINT)
    suspend fun fetchCategories(): List<String>

    @GET("products/category/{categoryName}")
    suspend fun fetchProducts(@Path("categoryName") categoryName: String): List<Product>
}