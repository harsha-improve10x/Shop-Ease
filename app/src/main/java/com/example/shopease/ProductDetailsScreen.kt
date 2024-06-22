package com.example.shopease

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import coil.compose.AsyncImage

@Composable
fun ProductDetailsScreen() {

}

@Composable
fun ProductDetails() {
    Column(modifier = Modifier.fillMaxSize()) {
        AsyncImage(model = "", contentDescription = null)
        Text("Title")
        Text("Price")
        Text("Description")
    }
}