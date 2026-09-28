package com.hajun.myapplication.data.model

data class Category(
    val id: Int,
    val name: String,
    val description: String?,
    val products_count: Int?
)
