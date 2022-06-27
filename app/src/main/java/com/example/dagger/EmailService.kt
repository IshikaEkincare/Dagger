package com.example.dagger

import android.util.Log
import javax.inject.Inject

interface NotificationService{
    fun sendEmail(to: String, from: String, body: String)
}

class EmailService @Inject constructor() : NotificationService{

    override fun sendEmail(to: String, from: String, body: String){
        Log.i("mail sent","Email sent")
    }

}

class MessageService : NotificationService{
    override fun sendEmail(to: String, from: String, body: String) {
        Log.i("messages","messages")
    }

}
