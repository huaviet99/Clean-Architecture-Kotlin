package com.example.domain.executor

import io.reactivex.rxjava3.core.Scheduler

/**
 * Created by Viet Hua on 5/9/2020
 */
interface ExecutionThread {
    fun io(): Scheduler
    fun main(): Scheduler

}