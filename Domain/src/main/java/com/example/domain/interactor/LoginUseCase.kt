package com.example.domain.interactor

import com.example.domain.executor.ExecutionThread
import com.example.domain.model.User
import com.example.domain.repository.UserRepository
import io.reactivex.rxjava3.core.Maybe
import io.reactivex.rxjava3.core.MaybeOnSubscribe
import io.reactivex.rxjava3.disposables.CompositeDisposable
import io.reactivex.rxjava3.disposables.Disposable
import io.reactivex.rxjava3.observers.DisposableMaybeObserver
import io.reactivex.rxjava3.schedulers.Schedulers
import javax.inject.Inject


/**
 * Created by Viet Hua on 5/9/2020
 */
class LoginUseCase @Inject constructor(
    val executionThread: ExecutionThread,
    val userRepository: UserRepository
) {
    private var compositeDisposable: CompositeDisposable = CompositeDisposable()


    fun execute(disposableMaybeObserver: DisposableMaybeObserver<String>, user: User) {
        val maybe = buildUseCase(user)
            .subscribeOn(executionThread.io())
            .observeOn(executionThread.main())
        addDisposable(maybe.subscribeWith(disposableMaybeObserver))


    }

    fun dispose() {
        this.compositeDisposable.dispose()
    }

    private fun buildUseCase(user: User): Maybe<String> {
        return userRepository.getData(user)
    }

    private fun addDisposable(disposable: Disposable) {
        this.compositeDisposable.add(disposable)
    }
}