package com.example.cleanarchitecturekotlin

import dagger.Binds
import dagger.Module

/**
 * Created by Viet Hua on 05/09/2020.
 */

@Module
abstract class MainModule {
    @Binds
    abstract fun bindMainPresenter(impl: MainPresenterImpl) : MainContract.Presenter

}