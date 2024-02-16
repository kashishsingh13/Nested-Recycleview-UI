package com.exmple.nestedrecycleapplication.Model

import com.exmple.nestedrecycleapplication.Model.CategoryItem

data class Allcategory(

    var categoryTitle:String,
    var categoryItem: List<CategoryItem>
)
