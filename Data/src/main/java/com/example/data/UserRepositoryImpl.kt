package com.example.data

import com.example.data.mapper.UserEntityMapper
import com.example.data.repository.UserDataLocal
import com.example.data.repository.UserDataRemote
import com.example.domain.model.User
import com.example.domain.repository.UserRepository
import io.reactivex.rxjava3.core.Maybe
import javax.inject.Inject

/**
 * Created by Viet Hua on 5/9/2020
 */
class UserRepositoryImpl @Inject constructor(
    val userDataRemote: UserDataRemote,
    val userDataLocal: UserDataLocal
) : UserRepository {
    private val userEntityMapper = UserEntityMapper()


    override fun getData(user: User): Maybe<String> {
        return userDataRemote.getData(userEntityMapper.mapToEntity(user))
    }
}