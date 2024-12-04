package com.example.appcontador.view

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainGuiViewModelv : ViewModel() {
    private val _contador = MutableLiveData<int>(0)
    var contador = _contador

    fun IncrementaContador(){
        _contador.value = _contador.value?.plus(1)
    }
}