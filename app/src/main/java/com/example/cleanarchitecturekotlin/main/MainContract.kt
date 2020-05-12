package com.example.cleanarchitecturekotlin.main

/**
 * Created by Viet Hua on 05/09/2020.
 */
interface MainContract {
    interface View {
        fun showLoginSuccessView(data: String?)
        fun showLoginFailedView(message:String?)
    }

    interface Presenter {
        fun attachView(view: View)
        fun detachView()
        fun login(username: String, password: String)
    }

}
