package com.notsys.core.port.`in`

import com.notsys.core.domain.User

interface GetUserUseCase {
    fun getUserById(id: Long): User?
}
