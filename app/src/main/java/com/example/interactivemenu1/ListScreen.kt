package com.example.interactivemenu1

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ListScreen(
    modifier: Modifier = Modifier,
    categories: List<FoodCategory>,
    items: List<MenuItem>
) {
    Column(
        modifier = modifier
    ) {

        // Lazy row for categories
        LazyRow(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            items(categories) { category ->
                CategoryItem(categoryData = category)
            }
        }

        // Add space between categories and items
        Spacer(modifier = Modifier.padding(vertical = 16.dp))

        // Lazy column for items
        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            verticalArrangement = Arrangement.spacedBy(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {


            items(items) { item ->
                MenuItem(itemData = item)
            }
            item {
                CircularProgressIndicator()
            }
        }
    }
}
