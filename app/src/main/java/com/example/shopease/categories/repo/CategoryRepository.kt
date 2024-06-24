package com.example.shopease.categories.repo

import com.example.shopease.api.FakeApiService

class CategoryRepository(private val apiService: FakeApiService) {
    suspend fun fetchCategories(): List<String> {
        return apiService.fetchCategories()
    }
}