package com.example.mathit_olympiadsapp.view.olymps_screens.math

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mathit_olympiadsapp.SearchBarView
import com.example.mathit_olympiadsapp.ui.theme.LightestGray
import com.example.mathit_olympiadsapp.R

@Preview(showBackground = true)
@Composable
fun MathScreen() {
    Column(
        modifier = Modifier.fillMaxHeight(0.92f)
    ) {
        var showFirstRec by remember { mutableStateOf(true) }
        Row {
            Text(
                text = "Олимпиады",
                textAlign = TextAlign.Left,
                modifier = Modifier.padding(start = 20.dp, top = 20.dp, bottom = 10.dp),
                fontWeight = FontWeight.SemiBold,
                color = Color.Black,
                fontSize = 36.sp,
                fontFamily = FontFamily(Font(R.font.tt_commons_medium))
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp),
            verticalAlignment = Alignment.Top,
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            var selectedOne by remember { mutableStateOf(true) }
            var selectedTwo by remember { mutableStateOf(false) }
            var selectedThree by remember { mutableStateOf(false) }
            val colorOne = if (selectedOne) LightestGray else Color.White
            val colorTwo = if (selectedTwo) LightestGray else Color.White
            val colorThree = if (selectedThree) LightestGray else Color.White
            val fontStyleOne =
                if (selectedOne) R.font.tt_commons_demi_bold else R.font.tt_commons_medium
            val fontStyleTwo =
                if (selectedTwo) R.font.tt_commons_demi_bold else R.font.tt_commons_medium
            val fontStyleThree =
                if (selectedThree) R.font.tt_commons_demi_bold else R.font.tt_commons_medium
            Button(
                modifier = Modifier
                    .padding(top = 5.dp, end = 3.dp, start = 3.dp, bottom = 12.dp),
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = colorOne,
                    contentColor = Color.Black
                ),
                border = BorderStroke(1.dp, Color.LightGray),
                shape = RoundedCornerShape(50),
                onClick = {
                    selectedOne = true
                    selectedTwo = false
                    selectedThree = false
                    showFirstRec = true
                }
            ) {
                Text(
                    text = "Уровень 1",
                    fontSize = 16.sp,
                    fontFamily = FontFamily(Font(fontStyleOne))
                )
            }
            Button(
                modifier = Modifier
                    .padding(top = 5.dp, end = 3.dp, start = 3.dp, bottom = 12.dp),
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = colorTwo,
                    contentColor = Color.Black
                ),
                border = BorderStroke(1.dp, Color.LightGray),
                shape = RoundedCornerShape(50),
                onClick = {
                    selectedOne = false
                    selectedTwo = true
                    selectedThree = false
                    showFirstRec = false
                },
            ) {
                Text(
                    "Уровень 2",
                    fontSize = 16.sp,
                    fontFamily = FontFamily(Font(fontStyleTwo))
                )
            }

            Button(
                modifier = Modifier
                    .padding(top = 5.dp, end = 3.dp, start = 3.dp, bottom = 12.dp),
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = colorThree,
                    contentColor = Color.Black
                ),
                border = BorderStroke(1.dp, Color.LightGray),
                shape = RoundedCornerShape(50),
                onClick = {
                    selectedOne = false
                    selectedTwo = false
                    selectedThree = true
                    showFirstRec = false
                },
            ) {
                Text(
                    "Уровень 3",
                    fontSize = 16.sp,
                    fontFamily = FontFamily(Font(fontStyleThree))
                )
            }
        }
        if (showFirstRec)
            OlympsList()
    }
}