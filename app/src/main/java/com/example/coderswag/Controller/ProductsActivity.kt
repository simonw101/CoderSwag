package com.example.coderswag.Controller

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.coderswag.Adapters.ProductsAdapter
import com.example.coderswag.R
import com.example.coderswag.Services.DataService
import com.example.coderswag.Utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_products.*

class ProductsActivity : AppCompatActivity() {

    lateinit var adapter : ProductsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)

        adapter = ProductsAdapter(this, DataService.getProducts(categoryType))

        val orientation = resources.configuration.orientation

        var spanCOunt = 2

        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {

            spanCOunt = 3

        }

        val screenSize = resources.configuration.screenWidthDp

        if (screenSize > 720) {

            spanCOunt == 3

        }

        val layoutManager = GridLayoutManager(this, spanCOunt)

        productListView.layoutManager = layoutManager

        productListView.adapter = adapter
    }
}
