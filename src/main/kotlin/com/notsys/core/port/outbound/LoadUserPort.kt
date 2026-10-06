package com.notsys.core.port.outbound

import com.notsys.core.domain.User

interface LoadUserPort {
    fun loadUserById(id: Long): User?
}
