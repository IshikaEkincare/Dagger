package com.example.dagger

import javax.inject.Inject

class UserRegistrationservice @Inject constructor(private val userRepository: UserRepository,
private val notificationService: NotificationService) {

    fun registerUser(email: String, password: String){
        userRepository.saveData(email,password)
        notificationService.sendEmail(email,"jetbrain@gmail.com","Welcome to the jetbrains")
    }
}