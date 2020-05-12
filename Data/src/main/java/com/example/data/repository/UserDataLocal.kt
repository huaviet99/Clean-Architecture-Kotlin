package com.example.data.repository

import com.example.data.entity.UserEntity
import io.reactivex.rxjava3.core.Maybe

/**
 * Created by Viet Hua on 5/9/2020
 */

interface UserDataLocal{
    fun getData(userEntity: UserEntity) : Maybe<String>
}