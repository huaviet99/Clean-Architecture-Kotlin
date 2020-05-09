package com.example.cleanarchitecturekotlin.di

import com.example.cleanarchitecturekotlin.MyApp
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import javax.inject.Singleton

/**
 * Created by Viet Hua on 05/09/2020.
 */

@Singleton
@Component(modules = [AndroidInjectionModule::class, AppBindingModule::class])
interface AppComponent : AndroidInjector<DaggerApplication> {
    fun inject(instance: MyApp)

    @Component.Builder
    interface Builder {

        fun build(): AppComponent

        @BindsInstance
        fun application(application: MyApp): Builder

    }

}