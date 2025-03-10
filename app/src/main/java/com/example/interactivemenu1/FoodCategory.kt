package com.example.interactivemenu1

import androidx.annotation.DrawableRes

// • FoodCategory (id, name, description, image)
data class FoodCategory(
    val id: Int,
    val name: String,
    val description: String,
    @DrawableRes val CategoryImage: Int
) {
    companion object {
        val Example1 = FoodCategory(
            id = 1,
            name = "Burgers",
            description = "Delicious grilled burgers with fresh ingredients.",
            CategoryImage = R.drawable.burger_pic
        )

        val Example2 = FoodCategory(
            id = 2,
            name = "Pizza",
            description = "Cheesy and loaded with toppings.",
            CategoryImage = R.drawable.pizza_pic
        )

        val Example3 = FoodCategory(
            id = 3,
            name = "Salads",
            description = "Healthy and fresh salad options.",
            CategoryImage = R.drawable.salad_pic
        )
    }
}

// • MenuItem (id, name, price, description, category, imageItem, is_Popular)
data class MenuItem(
    val id: Int,
    val name: String,
    val price: Double,
    val description: String,
    val category: FoodCategory,
    @DrawableRes val imageItem: Int,
    val isPopular: Boolean
) {
    companion object {
        val Example1 = MenuItem(
            id = 1,
            name = "Caesar Salad",
            price = 48.99,
            description = "Crisp romaine lettuce, parmesan cheese, and Caesar dressing.",
            category = FoodCategory.Example3,
            imageItem = R.drawable.caesar,
            isPopular = true
        )

        val Example2 = MenuItem(
            id = 2,
            name = "Classic Burger",
            price = 59.99,
            description = "Juicy beef patty with lettuce, tomato, and our signature sauce.",
            category = FoodCategory.Example1,
            imageItem = R.drawable.classic_burger,
            isPopular = true
        )

        val Example3 = MenuItem(
            id = 3,
            name = "Classic Pizza",
            price = 47.99,
            description = "classic pizza tomato, and our signature sauce.",
            category = FoodCategory.Example2,
            imageItem = R.drawable.classic_pizza,
            isPopular = true

        )

        val Example4 = MenuItem(
            id = 4,
            name = "Pepperoni Pizza",
            price = 60.99,
            description = "classic pizza with fresh tomatoes and mozzarella , and olive oil.",
            category = FoodCategory.Example2,
            imageItem = R.drawable.pepp_piza,
            isPopular = true

        )

        val Example5 = MenuItem(
            id = 5,
            name = "Greek Salad",
            price = 33.90,
            description = "Fresh cucambers , tomatoes, red onions, olives, and feta cheese",
            category = FoodCategory.Example3,
            imageItem = R.drawable.greek_pic,
            isPopular = true

        )
    }
}
