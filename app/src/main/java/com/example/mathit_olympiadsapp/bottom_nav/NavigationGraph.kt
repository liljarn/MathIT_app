package com.example.mathit_olympiadsapp.bottom_nav

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.mathit_olympiadsapp.view.olymps_screens.ITScreen
import com.example.mathit_olympiadsapp.view.olymps_screens.math.MathScreen
import com.example.mathit_olympiadsapp.view.olymps_screens.PhysScreen
import com.example.mathit_olympiadsapp.view.profile_screen.ProfileScreen
import com.example.mathit_olympiadsapp.view.profile_screen.Screen
import com.example.mathit_olympiadsapp.viewmodels.MainViewModel


@Composable
fun NavigationGraph(navController: NavHostController, viewModel : MainViewModel) {
    NavHost(navController, startDestination = BottomNavItem.Math.screen_route) {
        composable(BottomNavItem.Math.screen_route) {
            MathScreen(navController, viewModel)
        }

        composable(BottomNavItem.IT.screen_route) {
            ITScreen()
        }

        composable(BottomNavItem.Physics.screen_route) {
            PhysScreen()
        }
        composable(Screen.ProfileScreen.route){
            ProfileScreen(navController)
        }
    }
}