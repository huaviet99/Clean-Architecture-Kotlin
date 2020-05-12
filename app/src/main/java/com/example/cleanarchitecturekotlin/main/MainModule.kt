package com.example.cleanarchitecturekotlin.main

import dagger.Binds
import dagger.Module

/**
 * Created by Viet Hua on 5/9/2020
 */


@Module
abstract class MainModule {
    @Binds
    abstract fun bindMainPresenter(impl: MainPresenterImpl) : MainContract.Presenter

}