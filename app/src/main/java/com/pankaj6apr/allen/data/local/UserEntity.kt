package com.pankaj6apr.allen.data.local

import androidx.room.Entity
import com.pankaj6apr.allen.domain.model.User

@Entity
data class UserEntity(
    val name: String,
    var amount: Double
)

fun UserEntity.toUser(): User {
    return User(
        name = name,
        amount = amount
    )
}
