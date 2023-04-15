package com.example.mathit_olympiadsapp


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.mathit_olympiadsapp.ui.theme.Grei
import com.example.mathit_olympiadsapp.ui.theme.LightestGray
import com.example.mathit_olympiadsapp.view.profile_screen.Screen


@Composable
fun SearchBarView(navController: NavController) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 20.dp, end = 20.dp, top = 24.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Card(
            shape = RoundedCornerShape(10.dp),
            backgroundColor = LightestGray,
            modifier = Modifier.fillMaxWidth(0.8f)
        ) {
            val searchImage: Painter = painterResource(id = R.drawable.search_icon)
            Image(
                modifier = Modifier.padding(start = 12.dp),
                painter = searchImage, contentDescription = "",
                alignment = Alignment.CenterStart
            )

        }
        IconButton(
            onClick = {
                navController.navigate(Screen.ProfileScreen.route) {
                    navController.graph.startDestinationRoute?.let { screen_route ->
                        popUpTo(screen_route) {
                            saveState = true
                        }
                    }
                    launchSingleTop = true
                    restoreState = true
                }
            },
        ) {
            Icon(
                painter = painterResource(R.drawable.profile_icon2),
                "",
                tint = Grei
            )
        }
    }
}
