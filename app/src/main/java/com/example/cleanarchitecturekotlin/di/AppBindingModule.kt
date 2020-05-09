package com.example.cleanarchitecturekotlin.di

import com.example.cleanarchitecturekotlin.MainActivity
import com.example.cleanarchitecturekotlin.MainModule
import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector

/**
 * Created by Viet Hua on 05/09/2020.
 */

@Module
abstract class AppBindingModule {
    @ContributesAndroidInjector(modules = [MainModule::class])
    abstract fun mainActivity(): MainActivity

}