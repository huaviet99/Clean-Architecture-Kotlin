package com.example.cleanarchitecturekotlin.di

import com.example.cleanarchitecturekotlin.app.MyApp
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import javax.inject.Singleton

/**
 * Created by Viet Hua on 5/9/2020
 */

@Singleton
@Component(modules = [AndroidInjectionModule::class, AppBindingModule::class, AppModule::class,
    DataModule::class, LocalModule::class, RemoteModule::class])
interface AppComponent : AndroidInjector<DaggerApplication> {

    fun inject(instance: MyApp)

    @Component.Builder
    interface Builder {
        fun build(): AppComponent

        @BindsInstance
        fun application(myApp: MyApp): Builder

    }


}