package com.example.mathit_olympiadsapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.navigation.compose.rememberNavController
import com.example.mathit_olympiadsapp.bottom_nav.MainScreenView
import com.example.mathit_olympiadsapp.viewmodels.MainViewModel


class MainActivity : ComponentActivity() {
    val viewModel : MainViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            MainScreenView(navController, viewModel)
        }
    }
}
