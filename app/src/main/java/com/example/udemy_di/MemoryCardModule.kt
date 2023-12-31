package com.example.udemy_di

import android.util.Log
import dagger.Module
import dagger.Provides

@Module
class MemoryCardModule(val memorySize : Int) {

    @Provides
    fun providesMemoryCard(): MemoryCard {
        Log.i("MYTAG", "Size of the memory card is $memorySize")
        return MemoryCard()
    }

}