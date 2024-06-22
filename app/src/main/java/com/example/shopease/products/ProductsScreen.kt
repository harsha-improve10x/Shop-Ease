package com.example.shopease.products

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage

@Composable
fun ProductsScreen() {

}

@Composable
fun ProductCard() {
    Card(modifier = Modifier.size(300.dp)) {
        Column() {
            AsyncImage(model = "", contentDescription = null)
            Text("Title")
            Text("Price")
        }
    }
}

@Composable
fun ProductList() {
    LazyVerticalGrid(columns = GridCells.Fixed(2)) {

    }
}