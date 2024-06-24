package com.example.shopease.products

import com.google.gson.annotations.SerializedName

data class Product(
    val id: Int,
    val title: String,
    val price: Float,
    @SerializedName("image")
    val imageUrl: String,
    val description: String,
    var rating: Rating
)


