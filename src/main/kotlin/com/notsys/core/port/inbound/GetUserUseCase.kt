package com.notsys.core.port.inbound

import com.notsys.core.domain.User

interface GetUserUseCase {
    fun getUserById(id: Long): User?
}
