package com.example.mathit_olympiadsapp.view.olymps_screens.math

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.example.mathit_olympiadsapp.ColumnMathFirstTier
import com.example.mathit_olympiadsapp.R

@Composable
@OptIn(ExperimentalFoundationApi::class)
fun OlympsList() {
    LazyVerticalGrid(
        cells = GridCells.Fixed(2),

        contentPadding = PaddingValues(
            start = 16.dp,
            top = 16.dp,
            end = 16.dp,
            bottom = 16.dp
        ),
        content = {
            itemsIndexed(
                listOf(
                    ItemMathFirstTier(R.drawable.hse, "Высшая проба", "idi"),
                    ItemMathFirstTier(R.drawable.phys, "Физтех", "nahui"),
                    ItemMathFirstTier(R.drawable.pvg, "Покори воробьёвы горы!", "yebishe"),
                    ItemMathFirstTier(R.drawable.spb, "Олимпиада школьников СПБГУ", "ebanoe"),
                    ItemMathFirstTier(R.drawable.lomo, "Олимпиада Ломоносов", "nenavizhy"),
                    ItemMathFirstTier(R.drawable.tournament, "Турнир городов", "tebya"),
                    ItemMathFirstTier(
                        R.drawable.mos,
                        "Московская олимпиада школьников",
                        "sin shluhi"
                    )
                )
            ) { _, item ->
                ColumnMathFirstTier(item = item)
            }
        }
    )
}