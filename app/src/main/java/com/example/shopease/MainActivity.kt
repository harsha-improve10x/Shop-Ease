package com.example.shopease

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.shopease.api.FakeApi
import com.example.shopease.categories.ui.CategoryScreen
import com.example.shopease.categories.repo.CategoryRepository
import com.example.shopease.categories.viewmodel.CategoryViewModel
import com.example.shopease.ui.theme.ShopEaseTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ShopEaseTheme {
                   CategoryScreen(
                       categoryViewModel = CategoryViewModel(
                           CategoryRepository(FakeApi().createCategoriesService())
                       )
                   )
                }
            }
        }
    }

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ShopEaseTheme {

    }
}