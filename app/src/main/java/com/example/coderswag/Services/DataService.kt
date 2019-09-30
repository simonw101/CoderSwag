package com.example.coderswag.Services

import com.example.coderswag.Modal.Category
import com.example.coderswag.Modal.Product

object DataService {

    val categories = listOf(

        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage")

    )

    val hats = listOf(

        Product("Devslopes Graphic Beanie", "$18", "hat1"),
        Product("Devslopes Hat Black", "$20", "hat2"),
        Product("Devslopes Hat White", "$18", "hat3"),
        Product("Devslopes Hat SnapBack", "$22", "hat4")

    )

    val hoodies = listOf(

        Product("Devslopes Hoodie Grey", "$28", "hoodie1"),
        Product("Devslopes Hoodie Red", "$32", "hoodie2"),
        Product("Devslopes Hoodie Grey", "$28", "hoodie3"),
        Product("Devslopes Hoodie Black", "$28", "hoodie4")

    )

    val shirts = listOf(

        Product("Devslopes Shirt Black", "$18", "shirt1"),
        Product("Devslopes Badge Light gray", "$20", "shirt2"),
        Product("Devslopes Logo Shirt red", "$22", "shirt3"),
        Product("Devslopes Hustle", "$22", "shirt4"),
        Product("Kickflip Studios", "$18", "shirt5")

    )

    val digitalGoods = listOf<Product>()

    fun getProducts(category: String) : List<Product> {

        return when(category) {

            "SHIRTS" -> shirts
            "HATS" -> hats
            "HOODIES" -> hoodies

            else -> digitalGoods

        }
    }

}