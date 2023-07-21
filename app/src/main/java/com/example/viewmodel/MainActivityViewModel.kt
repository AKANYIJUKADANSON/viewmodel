package com.example.viewmodel

import androidx.lifecycle.ViewModel

class MainActivityViewModel() :ViewModel() {
    private var count = 0

    // function to do the counting
    fun getCurrentCountValue():Int{
        return count
    }

    fun updateValueByOne():Int{
        return ++count
    }
}