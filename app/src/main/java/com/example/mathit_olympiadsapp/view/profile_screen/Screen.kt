package com.example.mathit_olympiadsapp.view.profile_screen

sealed class Screen(val route: String){
    object ProfileScreen : Screen("profile_screen")
}
