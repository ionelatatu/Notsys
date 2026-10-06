package com.notsys.core.service

import com.notsys.core.domain.User
import com.notsys.core.port.`in`.GetUserUseCase
import com.notsys.core.port.out.LoadUserPort
import org.springframework.stereotype.Service

@Service
class UserService(
    private val loadUserPort: LoadUserPort,
) : GetUserUseCase {

    override fun getUserById(id: Long): User? {
        return loadUserPort.loadUserById(id)
    }
}
