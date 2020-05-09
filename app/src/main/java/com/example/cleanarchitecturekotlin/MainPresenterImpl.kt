package com.example.cleanarchitecturekotlin

/**
 * Created by Viet Hua on 05/09/2020.
 */

class MainPresenterImpl : MainContract.Presenter {

    private var mView: MainContract.View? = null


    override fun attachView(view: MainContract.View) {
        mView = view
    }

    override fun detachView() {
        mView = null
    }

    override fun login(username: String, password: String) {
        if (username == "test" && password == "123456") {
            mView!!.showLoginSuccessView()
        } else {
            mView!!.showLoginFailedView()
        }
    }
}
