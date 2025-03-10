package com.example.interactivemenu1

import androidx.annotation.DrawableRes
data class FoodCategory(
    val id : Int ,
    val name : String ,
    val description : String,
    @Drawable val CategoryImage : Int,
){
    companion object {
        val Example1 = FoodCategory(
            id = 1 ,
            name = "Burgers",
            CategoryImage = R.drawable.burger_icon,

        )
    }
}
