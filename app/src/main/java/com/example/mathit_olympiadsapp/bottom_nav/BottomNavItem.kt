package com.example.mathit_olympiadsapp.bottom_nav

import com.example.mathit_olympiadsapp.R

sealed class BottomNavItem(var title: String, var icon: Int, var screen_route: String) {
    object Math : BottomNavItem("Математика", R.drawable.math_icon, "math")
    object Physics : BottomNavItem("Физика", R.drawable.physics_icon, "phys")
    object IT : BottomNavItem("Информатика", R.drawable.it_icon, "IT")
}