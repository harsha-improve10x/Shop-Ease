package com.example.shopease

class CategoryRepository(private val apiService: FakeApiService) {
    suspend fun fetchCategories(): List<String> {
        return apiService.fetchCategories()
    }
}