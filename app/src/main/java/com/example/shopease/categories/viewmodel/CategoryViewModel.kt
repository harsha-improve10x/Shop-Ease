package com.example.shopease.categories.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.shopease.categories.repo.CategoryRepository
import kotlinx.coroutines.launch

class CategoryViewModel(private val repository: CategoryRepository) : ViewModel() {
    private val _uiState = MutableLiveData<List<String>>()
    val uiState: LiveData<List<String>> = _uiState

    init {
        fetchCategories()
    }

    fun fetchCategories() {
        viewModelScope.launch {
            val categories = repository.fetchCategories()
            _uiState.value = categories
        }
    }
}