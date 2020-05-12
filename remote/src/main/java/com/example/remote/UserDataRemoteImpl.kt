package com.example.remote

import com.example.data.entity.UserEntity
import com.example.data.repository.UserDataRemote
import io.reactivex.rxjava3.core.Maybe
import javax.inject.Inject

/**
 * Created by Viet Hua on 5/9/2020
 */

class UserDataRemoteImpl @Inject constructor() : UserDataRemote{

    override fun getData(userEntity: UserEntity): Maybe<String> {
        return Maybe.create { emitter ->
            if(userEntity.username == "test" && userEntity.password == "123456"){
                emitter.onSuccess("This is your data from remote")
            } else {
                emitter.onError(Throwable("Failed to get data"))
            }
            emitter.onComplete()
        }
    }
}