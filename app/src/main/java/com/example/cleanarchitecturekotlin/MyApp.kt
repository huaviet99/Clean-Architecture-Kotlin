package com.example.cleanarchitecturekotlin

import android.app.Application
import com.example.cleanarchitecturekotlin.di.AppComponent
import com.example.cleanarchitecturekotlin.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import java.util.*
import javax.inject.Inject

/**
 * Created by Viet Hua on 05/09/2020.
 */
class MyApp : Application(),HasAndroidInjector{

    @Inject
    lateinit var dispatchingAndroidInjector : DispatchingAndroidInjector<Any>

    private lateinit var appComponent: AppComponent
    override fun androidInjector(): AndroidInjector<Any> {
        return  dispatchingAndroidInjector
    }

    override fun onCreate() {
        super.onCreate()
        initDagger()
    }

    private fun initDagger(){
        appComponent = DaggerAppComponent.builder().application(this).build()
        appComponent.inject(this)
    }

}