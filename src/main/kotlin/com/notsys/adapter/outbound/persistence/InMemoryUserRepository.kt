package com.notsys.adapter.outbound.persistence

import com.notsys.core.domain.User
import com.notsys.core.port.outbound.LoadUserPort
import org.springframework.stereotype.Component

@Component
class InMemoryUserRepository : LoadUserPort {

    private val users = mapOf(
        1L to User(id = 1, firstName = "Ionela", lastName = "Tatu"),
        2L to User(id = 2, firstName = "Alex", lastName = "Popescu"),
    )

    override fun loadUserById(id: Long): User? = users[id]
}
