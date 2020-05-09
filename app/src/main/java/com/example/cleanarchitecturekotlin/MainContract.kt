package com.example.cleanarchitecturekotlin

/**
 * Created by Viet Hua on 05/09/2020.
 */
interface MainContract {
    interface View {
        fun showLoginSuccessView()
        fun showLoginFailedView()
    }

    interface Presenter {
        fun attachView(view: View)
        fun login(username: String, password: String)
    }

}
