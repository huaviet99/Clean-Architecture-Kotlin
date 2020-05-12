package com.example.data.mapper

import com.example.data.entity.UserEntity
import com.example.domain.model.User

/**
 * Created by Viet Hua on 5/9/2020
 */

class UserEntityMapper {
    fun mapToEntity(user: User): UserEntity {
        return UserEntity(user.username, user.password)
    }


    fun mapFromEntity(userEntity: UserEntity): User {
        return User(userEntity.username, userEntity.password)
    }

}