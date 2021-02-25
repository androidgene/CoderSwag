package com.example.coderswag.repository

import android.graphics.PorterDuff
import com.example.coderswag.R
import com.example.coderswag.models.CategoryModel
import com.example.coderswag.models.ProductModel

object CoderSwagRepository {

    private val categories = listOf(
        CategoryModel("Shirts", R.drawable.shirts),
        CategoryModel("Hoodies", R.drawable.hoodies),
        CategoryModel("Hats", R.drawable.hats),
        CategoryModel("Digital", R.drawable.digital)
    )

    private val shirts = listOf(
        ProductModel("Devsloptes Logo", "Shirt Black", "$18", R.drawable.shirt01),
        ProductModel("Devslopes Badge Shirt", "Light Grey", "$19", R.drawable.shirt02),
        ProductModel("Devslopes Logo Shirt Red", "", "$18", R.drawable.shirt03),
        ProductModel("Hustle Delegate Grey", "", "$18", R.drawable.shirt04),
        ProductModel("Kickflip Studios Black", "", "$18", R.drawable.shirt05)
    )

    private val hats = listOf(
        ProductModel("Devslopes Logo Graphic Beanie", "", "$18", R.drawable.hat01),
        ProductModel("Devslopes Logo Hat Black", "", "$22", R.drawable.hat02),
        ProductModel("Devslopes Logo Hat White", "", "$22", R.drawable.hat03),
        ProductModel("Devslopes Logo Snapback", "", "$20", R.drawable.hat04)
    )

    private val hoodies = listOf(
        ProductModel("Devslopes Logo Hoodie Grey", "", "$32", R.drawable.hoodie01),
        ProductModel("Devslopes Logo Hoodie Red", "", "$32", R.drawable.hoodie02),
        ProductModel("Devslopes Hoodie Grey", "", "$32", R.drawable.hoodie03),
        ProductModel("Devslopes Hoodie Black", "", "$32", R.drawable.hoodie04)
    )

    private val digital = emptyList<ProductModel>()

    fun getCategories() = categories

    fun getProduct(category: String): List<ProductModel>{
        return when (category) {
            "Shirts" -> shirts
            "Hoodies" -> hoodies
            "Hats" -> hats
            "Digital" -> digital
            else -> emptyList()
        }
    }
}