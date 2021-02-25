package com.example.coderswag

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.coderswag.databinding.ActivityMainBinding
import com.example.coderswag.repository.CoderSwagRepository

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.categoryList.apply {
            adapter = CategoryAdapter(
                CoderSwagRepository.getCategories()
            ) {categoryModel ->
                val intent = Intent(this@MainActivity, CategoryActivity::class.java)
                intent.putExtra(CategoryActivity.CATEGORY, categoryModel.title)
                startActivity(intent)
            }
            layoutManager = LinearLayoutManager(this@MainActivity)
            setHasFixedSize(true)
        }
    }
}