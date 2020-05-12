package com.example.cleanarchitecturekotlin.di

import com.example.data.repository.UserDataLocal
import com.example.local.UserDataLocalImpl
import dagger.Binds
import dagger.Module

/**
 * Created by Viet Hua on 5/12/2020
 */

@Module
abstract class LocalModule{
    @Binds
    abstract fun bindUserDataLocal(userDataLocalImpl: UserDataLocalImpl) : UserDataLocal

}