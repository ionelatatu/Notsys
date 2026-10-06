package com.notsys.core.port.out

import com.notsys.core.domain.User

interface LoadUserPort {
    fun loadUserById(id: Long): User?
}
