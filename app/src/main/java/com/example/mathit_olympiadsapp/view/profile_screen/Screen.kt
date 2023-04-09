package com.example.mathit_olympiadsapp.view.profile_screen

sealed class Screen(val route: String){
    object MainScreen : Screen("main_screen")
    object ProfileScreen : Screen("profile_screen")
}
