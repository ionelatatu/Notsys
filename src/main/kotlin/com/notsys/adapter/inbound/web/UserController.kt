package com.notsys.adapter.inbound.web

import com.notsys.core.port.inbound.GetUserUseCase
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/users")
class UserController(private val getUserUseCase: GetUserUseCase) {

    @GetMapping("/{id}")
    fun getUser(@PathVariable id: Long): ResponseEntity<UserResponse> {
        val user = getUserUseCase.getUserById(id)
        return if (user != null) {
            ResponseEntity.ok(user.toResponse())
        } else {
            ResponseEntity.notFound().build()
        }
    }
}
