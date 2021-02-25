package com.example.coderswag

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.coderswag.databinding.ItemProductBinding
import com.example.coderswag.models.ProductModel

class ProductAdapter(
    private val products: List<ProductModel>)
    : RecyclerView.Adapter<ProductAdapter.ProductViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemProductBinding.inflate(inflater, parent, false)
        return ProductViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
       holder.onBind(products[position])
    }

    override fun getItemCount() : Int = products.size

    class ProductViewHolder(
        private val binding: ItemProductBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun onBind(product: ProductModel) {
            binding.apply {
                productName.text = product.name
                productSubtitle.text = product.subtitle
                productPrice.text = product.price
                productImage.setImageResource(product.image)
            }
        }
    }
}