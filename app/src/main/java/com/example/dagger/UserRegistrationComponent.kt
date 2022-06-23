package com.example.dagger

import dagger.Component


@Component
interface UserRegistrationComponent {

    fun getUserRegistrationService(): UserRegistrationservice
}