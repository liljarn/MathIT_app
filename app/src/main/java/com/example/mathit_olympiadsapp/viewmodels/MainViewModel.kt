package com.example.mathit_olympiadsapp.viewmodels

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.mathit_olympiadsapp.model.DataState
import com.example.mathit_olympiadsapp.model.Olympiads
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener

class MainViewModel : ViewModel() {
    val response: MutableState<DataState> = mutableStateOf(DataState.Empty)

    init {
        fetchDataFromFirebase()
    }

    private fun fetchDataFromFirebase() {
        val tempList = mutableListOf<Olympiads>()
        response.value = DataState.Loading
        FirebaseDatabase.getInstance().getReference("Logos")
            .addListenerForSingleValueEvent(object : ValueEventListener {
                override fun onDataChange(snapshot: DataSnapshot) {
                    print(response)
                    for (DataSnap in snapshot.children) {
                        val olympiadItem = DataSnap.getValue(Olympiads::class.java)
                        if (olympiadItem != null)
                            tempList.add(olympiadItem)
                    }
                    response.value = DataState.Success(tempList)
                }

                override fun onCancelled(error: DatabaseError) {
                    println(response)
                    response.value = DataState.Failure(error.message)
                }

            })
    }
}