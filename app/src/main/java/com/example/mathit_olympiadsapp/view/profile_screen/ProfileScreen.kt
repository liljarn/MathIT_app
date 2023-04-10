package com.example.mathit_olympiadsapp.view.profile_screen

import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.mathit_olympiadsapp.R
import com.example.mathit_olympiadsapp.ui.theme.Grei
import com.example.mathit_olympiadsapp.view.BackButton

@Composable
fun ProfileScreen(navController: NavHostController) {
    BackButton(navController = navController)
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "ЗДЕСЬ БУДЕТ ЭКРАН ПРОФИЛЯ, ПОКА ЧТО СЪЕБИ ОТСЮДА",
            fontSize = 20.sp,
            fontFamily = FontFamily(Font(R.font.tt_commons_demi_bold)),
        )
    }
}