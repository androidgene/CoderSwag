package com.example.coderswag

import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.example.coderswag.databinding.ActivityCategoryBinding
import com.example.coderswag.repository.CoderSwagRepository

class CategoryActivity : AppCompatActivity()  {

    companion object {
        const val CATEGORY = "CATEGORY"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityCategoryBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val category = intent.getStringExtra(CATEGORY).orEmpty()
        val products = CoderSwagRepository.getProduct(category)

        Log.v("CategoryActivity", "category = $category")

        binding.productList.apply {
            adapter = ProductAdapter(products)
            layoutManager = GridLayoutManager(this@CategoryActivity, 2)
            setHasFixedSize(true)
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            onBackPressed()
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}