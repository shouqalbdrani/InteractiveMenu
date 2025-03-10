package com.example.interactivemenu1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.interactivemenu1.ui.theme.InteractiveMenu1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            InteractiveMenu1Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ListScreen(
                        modifier = Modifier
                            .padding(innerPadding),
                        categories = listOf(
                            FoodCategory.Example1,
                            FoodCategory.Example2,
                            FoodCategory.Example3
                        ),
                        items = listOf(
                            MenuItem.Example1,
                            MenuItem.Example2,
                            MenuItem.Example3,
                            MenuItem.Example4,
                            MenuItem.Example5
                        )
                    )
                }
            }
        }
    }
}