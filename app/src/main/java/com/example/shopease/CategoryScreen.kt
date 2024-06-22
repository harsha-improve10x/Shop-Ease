package com.example.shopease

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun CategoryScreen() {

}

@Composable
fun ActionButton(title: String) {
    Button(onClick = {}, Modifier.fillMaxWidth()) {
        Text(text = title)
    }
}