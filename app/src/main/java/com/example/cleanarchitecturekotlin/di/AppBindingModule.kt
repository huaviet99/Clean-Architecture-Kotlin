package com.example.cleanarchitecturekotlin.di

import com.example.cleanarchitecturekotlin.main.MainActivity
import com.example.cleanarchitecturekotlin.main.MainModule
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by Viet Hua on 5/9/2020
 */

@Module
abstract class AppBindingModule {
    @ContributesAndroidInjector(modules = [MainModule::class])
    abstract fun mainActivity(): MainActivity

}