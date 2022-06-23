package com.example.dagger

import android.util.Log
import javax.inject.Inject

class EmailService @Inject constructor(){

    fun sendEmail(to: String, from: String, body: String){
        Log.i("mail sent","Email sent")
    }

}
