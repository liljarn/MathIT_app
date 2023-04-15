package com.example.mathit_olympiadsapp.model

sealed class DataState {
    class Success(val data: MutableList<Olympiads>) : DataState()
    class Failure(val message: String) : DataState()
    object Loading : DataState()
    object Empty : DataState()
}
