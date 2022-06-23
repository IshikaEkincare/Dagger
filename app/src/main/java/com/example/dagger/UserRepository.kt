package com.example.dagger

import android.util.Log
import javax.inject.Inject

class UserRepository @Inject constructor() {

    fun saveData(email: String, password: String){
        Log.i("user saved"," user saved in db")
    }

}
