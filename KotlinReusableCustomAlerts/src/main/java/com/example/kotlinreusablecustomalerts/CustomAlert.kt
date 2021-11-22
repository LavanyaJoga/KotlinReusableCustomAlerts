package com.example.kotlinreusablecustomalerts

import android.content.Context
import android.widget.Toast

class CustomAlert {
    fun toastMsg(context:Context){
        Toast.makeText(context, "LavSree", Toast.LENGTH_SHORT).show()
    }
}