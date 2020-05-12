package com.example.cleanarchitecturekotlin.di

import com.example.cleanarchitecturekotlin.ExecutionThreadImpl
import com.example.domain.executor.ExecutionThread
import dagger.Module
import dagger.Provides

/**
 * Created by Viet Hua on 5/12/2020
 */

@Module
class AppModule {

    @Provides
    fun provideExecutionThread(): ExecutionThread {
        return ExecutionThreadImpl()
    }
}