package com.example.mathit_olympiadsapp.bottom_nav

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.mathit_olympiadsapp.viewmodels.MainViewModel

@Composable
fun MainScreenView(navController: NavHostController, viewModel: MainViewModel) {
    Scaffold(
        bottomBar = { BottomNavigation(navController = navController) },
        content = { padding ->
            Column(Modifier.padding(0.dp)) {
                NavigationGraph(navController = navController, viewModel)
            }

        })
}