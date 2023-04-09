package com.example.mathit_olympiadsapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

import com.example.mathit_olympiadsapp.ui.theme.LightestGray


@Composable
fun SearchBarView() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 20.dp, end = 20.dp, top = 24.dp),
        verticalAlignment = Alignment.Top,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Card(
            shape = RoundedCornerShape(10.dp),
            backgroundColor = LightestGray,
            modifier = Modifier.fillMaxWidth(0.8f)
        ) {
            val searchImage: Painter = painterResource(id = R.drawable.search_icon)
            Image(
                // modifier = Modifier.padding(start = 12.dp),
                painter = searchImage, contentDescription = "",
                alignment = Alignment.CenterStart
            )

        }

        Box(
            //Modifier.fillMaxWidth(),
            modifier = Modifier
                .background(Color.Black)
                .clickable {

                },
            contentAlignment = Alignment.CenterEnd,
        ) {
            val image: Painter = painterResource(id = R.drawable.profile_icon)
            Image(
                painter = image, contentDescription = ""
            )
        }
    }
}