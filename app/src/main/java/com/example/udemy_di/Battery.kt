package com.example.udemy_di

import android.util.Log

class Battery {

    init {
        Log.i("MYTAG", "Battery Constructed")
    }

    fun getPower() {
        Log.i("MYTAG", "Battery power is available")
    }
}