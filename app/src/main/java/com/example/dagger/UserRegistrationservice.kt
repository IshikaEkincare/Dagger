package com.example.dagger

import javax.inject.Inject

class UserRegistrationservice @Inject constructor(private val userRepository: UserRepository,
private val emailService: EmailService) {

    fun registerUser(email: String, password: String){
        userRepository.saveData(email,password)
        emailService.sendEmail(email,"jetbrain@gmail.com","Welcome to the jetbrains")
    }
}