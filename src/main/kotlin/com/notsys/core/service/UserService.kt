package com.notsys.core.service

import com.notsys.core.domain.User
import com.notsys.core.port.inbound.GetUserUseCase
import com.notsys.core.port.outbound.LoadUserPort
import org.springframework.stereotype.Service

@Service
class UserService(private val loadUserPort: LoadUserPort) : GetUserUseCase {

    override fun getUserById(id: Long): User? = loadUserPort.loadUserById(id)
}
