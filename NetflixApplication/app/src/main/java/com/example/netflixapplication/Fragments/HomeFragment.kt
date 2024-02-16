package com.example.netflixapplication.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.netflixapplication.Adapter.MainRecyclerAdapter
import com.example.netflixapplication.R
import com.example.netflixapplication.databinding.FragmentHomeBinding
import com.exmple.nestedrecycleapplication.Model.Allcategory
import com.exmple.nestedrecycleapplication.Model.CategoryItem


class HomeFragment : Fragment() {
    private lateinit var binding:FragmentHomeBinding
    private var categoryList= mutableListOf<Allcategory>()
    private var categoryitem1= mutableListOf<CategoryItem>()
    private var categoryitem2= mutableListOf<CategoryItem>()
    private var categoryitem= mutableListOf<CategoryItem>()
    private var categoryitem3= mutableListOf<CategoryItem>()
    private var categoryitem4= mutableListOf<CategoryItem>()
    private var categoryitem5= mutableListOf<CategoryItem>()

    private lateinit var categoryAdapter: MainRecyclerAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding= FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        prepareData()
        categoryitem1()
        catogoryitem()
        catogoryitem2()
        catogoryitem3()
        catogoryitem4()
        catogoryitem5()

        categoryAdapter= MainRecyclerAdapter(requireContext(),categoryList)
        binding.mainRecycler.layoutManager = LinearLayoutManager(requireContext())
        binding.mainRecycler.adapter = categoryAdapter

    }

    private fun prepareData() {
        categoryList.add(
            Allcategory(
                categoryTitle = "HollyWood",categoryitem
            )
        )
        categoryList.add(
            Allcategory(
                categoryTitle = "Best of OsCars",categoryitem1
            )
        )
        categoryList.add(
            Allcategory(
                categoryTitle = "BollyWood",categoryitem2
            )
        )
        categoryList.add(
            Allcategory(
                categoryTitle = "Category 4th",categoryitem4
            )
        )
        categoryList.add(
            Allcategory(
                categoryTitle = "Category 5th",categoryitem3
            )
        )
        categoryList.add(
            Allcategory(
                categoryTitle = "Category 6th",categoryitem5
            )
        )


    }

    private fun catogoryitem(){
        categoryitem.add(CategoryItem(id=1, imageurl =R.drawable.hollywood1))
        categoryitem.add(CategoryItem(id=2, imageurl =R.drawable.hollywood2))
        categoryitem.add(CategoryItem(id=3, imageurl =R.drawable.hollywood3))
        categoryitem.add(CategoryItem(id=4, imageurl =R.drawable.hollywood4))
        categoryitem.add(CategoryItem(id=5, imageurl =R.drawable.hollywood5))
        categoryitem.add(CategoryItem(id=6, imageurl =R.drawable.hollywood6))

    }
    private fun categoryitem1(){
        categoryitem1.add(CategoryItem(id=1, imageurl =R.drawable.bestofoscar1))
        categoryitem1.add(CategoryItem(id=2, imageurl =R.drawable.bestofoscar2))
        categoryitem1.add(CategoryItem(id=3, imageurl =R.drawable.bestofoscar3))
        categoryitem1.add(CategoryItem(id=4, imageurl =R.drawable.bestofoscar4))
        categoryitem1.add(CategoryItem(id=5, imageurl =R.drawable.bestofoscar5))
        categoryitem1.add(CategoryItem(id=6, imageurl =R.drawable.bestofoscar6))

    }
    private fun catogoryitem2(){
        categoryitem2.add(CategoryItem(id=1, imageurl =R.drawable.rani))
        categoryitem2.add(CategoryItem(id=2, imageurl =R.drawable.jawan))
        categoryitem2.add(CategoryItem(id=3, imageurl =R.drawable.moviedubbedinhindi3))
        categoryitem2.add(CategoryItem(id=4, imageurl =R.drawable.moviedubbedinhindi4))
        categoryitem2.add(CategoryItem(id=5, imageurl =R.drawable.moviedubbedinhindi5))
        categoryitem2.add(CategoryItem(id=6, imageurl =R.drawable.moviedubbedinhindi6))

    }
    private fun catogoryitem4(){
        categoryitem4.add(CategoryItem(id=1, imageurl =R.drawable.moviedubbedinhindi1))
        categoryitem4.add(CategoryItem(id=2, imageurl =R.drawable.moviedubbedinhindi2))
        categoryitem4.add(CategoryItem(id=3, imageurl =R.drawable.hollywood3))
        categoryitem4.add(CategoryItem(id=4, imageurl =R.drawable.hollywood4))
        categoryitem4.add(CategoryItem(id=5, imageurl =R.drawable.hollywood5))
        categoryitem4.add(CategoryItem(id=6, imageurl =R.drawable.hollywood6))

    }
    private fun catogoryitem3(){
        categoryitem3.add(CategoryItem(id=1, imageurl =R.drawable.bestofoscar1))
        categoryitem3.add(CategoryItem(id=2, imageurl =R.drawable.bestofoscar2))
        categoryitem3.add(CategoryItem(id=3, imageurl =R.drawable.bestofoscar3))
        categoryitem3.add(CategoryItem(id=4, imageurl =R.drawable.bestofoscar4))
        categoryitem3.add(CategoryItem(id=5, imageurl =R.drawable.bestofoscar5))
        categoryitem3.add(CategoryItem(id=6, imageurl =R.drawable.bestofoscar6))

    }
    private fun catogoryitem5(){
        categoryitem5.add(CategoryItem(id=1, imageurl =R.drawable.hollywood1))
        categoryitem5.add(CategoryItem(id=2, imageurl =R.drawable.hollywood2))
        categoryitem5.add(CategoryItem(id=3, imageurl =R.drawable.hollywood3))
        categoryitem5.add(CategoryItem(id=4, imageurl =R.drawable.hollywood4))
        categoryitem5.add(CategoryItem(id=5, imageurl =R.drawable.hollywood5))
        categoryitem5.add(CategoryItem(id=6, imageurl =R.drawable.hollywood6))

    }



}