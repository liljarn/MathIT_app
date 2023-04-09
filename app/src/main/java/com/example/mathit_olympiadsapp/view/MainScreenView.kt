package com.example.mathit_olympiadsapp.bottom_nav

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.example.mathit_olympiadsapp.SearchBarView

@Composable
fun MainScreenView(navController : NavHostController) {
    Scaffold(
        bottomBar = { BottomNavigation(navController = navController) },
    ) {
        NavigationGraph(navController = navController)
    }
    SearchBarView()
}