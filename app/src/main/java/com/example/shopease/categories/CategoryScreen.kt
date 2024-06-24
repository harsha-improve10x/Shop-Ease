package com.example.shopease.categories

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.shopease.CategoryRepository
import com.example.shopease.CategoryViewModel

@Composable
fun CategoryScreen(categoryViewModel: CategoryViewModel) {
    val categories by categoryViewModel.uiState.observeAsState(emptyList())
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(20.dp)
        .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.Center
    ) {
        ButtonsList(categories)
    }
}

@Composable
fun ActionButton(title: String) {
    Button(onClick = {}, Modifier.fillMaxWidth()) {
        Text(text = title)
    }
}

@Composable
fun ButtonsList(categories: List<String>) {
    Column(modifier = Modifier.fillMaxSize()) {
        categories.forEach { category ->
            ActionButton(title = category)
            Spacer(modifier = Modifier.height(10.dp))
        }
    }
}