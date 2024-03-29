package com.example.coderswag.Controller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.coderswag.Adapters.CategoryAdapter
import com.example.coderswag.Adapters.CategoryRecycleAdapter
import com.example.coderswag.Modal.Category
import com.example.coderswag.R
import com.example.coderswag.Services.DataService
import com.example.coderswag.Utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter : CategoryRecycleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryRecycleAdapter(this, DataService.categories) { category ->

            val productIntent = Intent(applicationContext, ProductsActivity::class.java)

            productIntent.putExtra(EXTRA_CATEGORY, category.title)

            startActivity(productIntent)

        }

        categoryListView.adapter = adapter

        val layoutManager  = LinearLayoutManager(this)

        categoryListView.layoutManager = layoutManager

        categoryListView.setHasFixedSize(true)





    }
}
