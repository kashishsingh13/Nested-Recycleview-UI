package com.example.netflixapplication.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.netflixapplication.R
import com.exmple.nestedrecycleapplication.Model.Allcategory
import com.exmple.nestedrecycleapplication.Model.CategoryItem

class CategoryItemAdapter(var context: Context, var categoryItem: MutableList<CategoryItem>): RecyclerView.Adapter<CategoryItemAdapter.CategoryItemViewHolder>() {
    class CategoryItemViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
        var itemimage: ImageView
        init {
           itemimage= itemView.findViewById(R.id.item_image)

        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryItemViewHolder {
        return  CategoryItemViewHolder(LayoutInflater.from(context).inflate(R.layout.cat_row_item,parent,false))

    }

    override fun onBindViewHolder(holder: CategoryItemViewHolder, position: Int) {
      holder.itemimage.setImageResource(categoryItem[position].imageurl)
    }

    override fun getItemCount(): Int {
        return categoryItem.size
    }
}