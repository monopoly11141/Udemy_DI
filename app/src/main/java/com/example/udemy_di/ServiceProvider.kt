package com.example.udemy_di

import android.util.Log
import javax.inject.Inject

class ServiceProvider @Inject constructor(){


    fun getServiceProvider() {
        Log.i("MYTAG", "Service Provider got")
    }
}
