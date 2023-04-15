package com.example.mathit_olympiadsapp.view.olymps_screens.math

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.example.mathit_olympiadsapp.ColumnMathFirstTier
import androidx.compose.foundation.lazy.grid.items
import com.example.mathit_olympiadsapp.model.Olympiads

@Composable
@OptIn(ExperimentalFoundationApi::class)
fun OlympsList(olympiadi: MutableList<Olympiads>) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),

        contentPadding = PaddingValues(
            start = 16.dp,
            top = 16.dp,
            end = 16.dp,
            bottom = 16.dp
        )
    ) {
        println(olympiadi)

        items(olympiadi) { olympiads ->
            ColumnMathFirstTier(olympiads = olympiads)
        }
    }
}