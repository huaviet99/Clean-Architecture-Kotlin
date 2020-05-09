package com.example.cleanarchitecturekotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import dagger.android.AndroidInjection
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity(), MainContract.View {


    @Inject
    lateinit var presenter: MainContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        AndroidInjection.inject(this)

        btnLogin.setOnClickListener { view: View? ->
            val username = edtUsername.text.toString()
            val password = edtPassword.text.toString()
            presenter.login(username, password)
        }
    }

    override fun onStart() {
        super.onStart()
        presenter.attachView(this)
    }

    override fun showLoginSuccessView() {
        Toast.makeText(this, "Login Success", Toast.LENGTH_SHORT).show()
    }

    override fun showLoginFailedView() {
        Toast.makeText(this, "Login Failed", Toast.LENGTH_SHORT).show()

    }

}
