package com.example.cleanarchitecturekotlin.main

import android.util.Log
import com.example.cleanarchitecturekotlin.ExecutionThreadImpl
import com.example.domain.interactor.LoginUseCase
import com.example.domain.model.User
import io.reactivex.rxjava3.observers.DisposableMaybeObserver
import javax.inject.Inject

/**
 * Created by Viet Hua on 05/09/2020.
 */

class MainPresenterImpl @Inject constructor() : MainContract.Presenter {
    private var mView: MainContract.View? = null
    @Inject
    lateinit var loginUseCase: LoginUseCase


    override fun attachView(view: MainContract.View) {
        mView = view

    }

    override fun detachView() {
        mView = null
        loginUseCase.dispose()
    }

    override fun login(username: String, password: String) {
        loginUseCase.execute(GetFriendObserver(), User(username, password))
    }

    private inner class GetFriendObserver : DisposableMaybeObserver<String>() {
        override fun onSuccess(data: String?) {
            mView!!.showLoginSuccessView(data)
        }

        override fun onComplete() {
            Log.d("MainPresenterImpl", "onComplete")
        }

        override fun onError(error: Throwable?) {
            mView!!.showLoginFailedView(error!!.message)
        }
    }
}
