package com.example.dagger

import android.util.Log
import javax.inject.Inject


interface UserRepository{
    fun saveData(email: String, password: String)
}

class SqlRepository @Inject constructor() : UserRepository{

    override fun saveData(email: String, password: String){
        Log.i("user saved"," user saved in db")
    }

}

class FireBaseRepository : UserRepository{
    override fun saveData(email: String, password: String) {
        Log.i("firebase "," stored in firebase")
    }

}
