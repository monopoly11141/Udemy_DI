package com.example.udemy_di

import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class NCBatteryModule {

    @Binds
    abstract fun bindsNCBattery(nickelCadmiumBattery: NickelCadmiumBattery) : Battery

}