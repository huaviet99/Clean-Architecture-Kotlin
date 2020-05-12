package com.example.local

import com.example.data.entity.UserEntity
import com.example.data.repository.UserDataLocal
import io.reactivex.rxjava3.core.Maybe
import io.reactivex.rxjava3.core.MaybeOnSubscribe
import javax.inject.Inject

/**
 * Created by Viet Hua on 5/9/2020
 */

class UserDataLocalImpl @Inject constructor() : UserDataLocal{

    override fun getData(userEntity: UserEntity): Maybe<String> {
        return Maybe.create { emitter ->
            if(userEntity.username == "test" && userEntity.password == "123456"){
                emitter.onSuccess("This is your data from local")
            } else {
                emitter.onError(Throwable("Failed to get data"))
            }
            emitter.onComplete()
        }
    }
}