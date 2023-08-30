package com.example.udemy_di

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var smartPhone : SmartPhone

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        DaggerSmartPhoneComponent.create()
//            .inject(this)

        (application as SmartPhoneApplication).smartPhoneComponent
            .inject(this)

        smartPhone.makeACallWithRecording()


//        val smartPhone = SmartPhone(Battery(), SIMCard(ServiceProvider()), MemoryCard())
//        smartPhone.makeACallWithRecording()
    }
}