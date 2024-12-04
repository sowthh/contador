package com.example.appcontador.view

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import com.example.appcontador.view.MainGuiViewModel

@Composable
fun ManGui(meuViewModel: MainGuiViewModel){
    val x: Int by meuViewModel.contador.observeAsState(0)
    var txtfieldValue by remember {
        mutableStateOf("")
    }

    Column {
        Text(text = "Contador1")
        Text(text = "Contador2")
        Text(text = "Contador3")
        TextField(value = x.toString(), onValueChange = {
        })
        Button(onClick = {
            meuViewModel.IncrementaContador()
        }){
            Text(text = "Run Clicks = " + x.toString())
        }
    }
}