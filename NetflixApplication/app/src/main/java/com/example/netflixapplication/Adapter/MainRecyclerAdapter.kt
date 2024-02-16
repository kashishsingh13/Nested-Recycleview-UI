package com.example.netflixapplication.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.netflixapplication.databinding.ItemRecycleBinding
import com.exmple.nestedrecycleapplication.Model.Allcategory
import com.exmple.nestedrecycleapplication.Model.CategoryItem

class MainRecyclerAdapter(var context: Context, var categoryList: MutableList<Allcategory>):
    RecyclerView.Adapter<MainRecyclerAdapter.MyViewHolder>() {
    class MyViewHolder(var binding: ItemRecycleBinding): RecyclerView.ViewHolder(binding.root) {
        var itemrecycler :RecyclerView
        init {
            itemrecycler = binding.catItemRecycler
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        var binding=ItemRecycleBinding.inflate(LayoutInflater.from(context),parent,false)
        return MyViewHolder(binding)
    }
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
          var category= categoryList[position]
        holder.binding.catTitle.text=category.categoryTitle
        setCatItemRecycler(holder.itemrecycler,
            categoryList[position].categoryItem as MutableList<CategoryItem>
        )
    }
    override fun getItemCount(): Int {
       return categoryList.size
    }
    private fun setCatItemRecycler(recyclerView: RecyclerView,categoryItem: MutableList<CategoryItem>){
        val itemRecyclerAdapter = CategoryItemAdapter(context, categoryItem)
        recyclerView.layoutManager=LinearLayoutManager(context,RecyclerView.HORIZONTAL,false)
        recyclerView.adapter=itemRecyclerAdapter
    }
}