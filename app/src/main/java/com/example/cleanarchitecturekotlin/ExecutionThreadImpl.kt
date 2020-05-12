package com.example.cleanarchitecturekotlin

import com.example.domain.executor.ExecutionThread
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.core.Scheduler
import io.reactivex.rxjava3.schedulers.Schedulers

/**
 * Created by Viet Hua on 5/9/2020
 */

class ExecutionThreadImpl : ExecutionThread {

    override fun io(): Scheduler {
        return Schedulers.io()
    }

    override fun main(): Scheduler {
        return AndroidSchedulers.mainThread()
    }
}