package com.example.domain.repository

import com.example.domain.model.User
import io.reactivex.rxjava3.core.Maybe

/**
 * Created by Viet Hua on 5/9/2020
 */

interface UserRepository {
        fun getData(user: User) : Maybe<String>
}