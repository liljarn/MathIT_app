package com.example.mathit_olympiadsapp

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mathit_olympiadsapp.view.olymps_screens.math.ItemMathFirstTier
import com.example.mathit_olympiadsapp.ui.theme.LightestGray



@Composable
fun ColumnMathFirstTier(item: ItemMathFirstTier) {
    val context = LocalContext.current
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .padding(5.dp)
            .size(height = 220.dp, width = 200.dp)
            .clip(RoundedCornerShape(16.dp))
            .background(LightestGray)
            .clickable {
                Toast.makeText(context, item.mes, Toast.LENGTH_SHORT).show()
            }
    ) {
        Image(
            painter = painterResource(id = item.imageID),
            contentDescription = "image", contentScale = ContentScale.Fit,
            modifier = Modifier
                .size(150.dp)
                .padding(top = 7.dp)
        )
        Text(
            text = item.name,
            color = Color.Black,
            modifier = Modifier
                .padding(5.dp),
            textAlign = TextAlign.Center,
            fontSize = 18.sp,
            fontFamily = FontFamily(Font(R.font.tt_commons_medium))
        )
    }
}