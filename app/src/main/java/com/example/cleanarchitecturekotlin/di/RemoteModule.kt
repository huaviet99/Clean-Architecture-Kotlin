package com.example.cleanarchitecturekotlin.di

import com.example.data.repository.UserDataRemote
import com.example.remote.UserDataRemoteImpl
import dagger.Binds
import dagger.Module

/**
 * Created by Viet Hua on 5/12/2020
 */

@Module
abstract class RemoteModule {
    @Binds
    abstract fun bindUserDataRemote(userDataRemoteImpl: UserDataRemoteImpl): UserDataRemote

}