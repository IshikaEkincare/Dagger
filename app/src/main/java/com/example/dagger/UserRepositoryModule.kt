package com.example.dagger

import dagger.Binds
import dagger.Module
import dagger.Provides


@Module
abstract class UserRepositoryModule {

//    @Binds
//    abstract fun getFirewallUserRepository(): UserRepository

    @Provides
    fun getSqlRepository(sqlRepository: SqlRepository): UserRepository{
        return sqlRepository
    }
}