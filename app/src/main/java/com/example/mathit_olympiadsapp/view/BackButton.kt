package com.example.mathit_olympiadsapp.view

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.mathit_olympiadsapp.R
import com.example.mathit_olympiadsapp.ui.theme.Grei
import com.example.mathit_olympiadsapp.view.profile_screen.Screen

@Composable
fun BackButton(navController : NavHostController) {
    IconButton(
        onClick = { navController.popBackStack() },
        modifier = Modifier.padding(start = 12.dp, end = 20.dp, top = 24.dp)
    ) {
        Icon(
            painter = painterResource(R.drawable.back_screen), "",
            tint = Grei,
        )
    }
}