package com.example.cleanarchitecturekotlin.di

import com.example.data.UserRepositoryImpl
import com.example.domain.repository.UserRepository
import dagger.Binds
import dagger.Module

/**
 * Created by Viet Hua on 5/12/2020
 */

@Module
abstract class DataModule{
    @Binds
    abstract fun bindUserRepository(userRepositoryImpl: UserRepositoryImpl) : UserRepository

}