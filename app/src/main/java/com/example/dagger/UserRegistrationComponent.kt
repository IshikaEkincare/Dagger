package com.example.dagger

import dagger.Component


@Component(modules = [UserRepositoryModule::class, NotificationServiceModule::class])
interface UserRegistrationComponent {


    fun inject(mainActivity: MainActivity)
}