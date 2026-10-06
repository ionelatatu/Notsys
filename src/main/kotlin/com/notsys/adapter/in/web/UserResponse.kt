package com.notsys.adapter.`in`.web

import com.notsys.core.domain.User

data class UserResponse(
    val id: Long,
    val firstName: String,
    val lastName: String,
)

fun User.toResponse() = UserResponse(
    id = id,
    firstName = firstName,
    lastName = lastName,
)
