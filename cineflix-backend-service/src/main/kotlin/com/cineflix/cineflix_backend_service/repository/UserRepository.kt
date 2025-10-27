package com.cineflix.cineflix_backend_service.repository

import com.cineflix.cineflix_backend_service.model.User
import org.springframework.data.jpa.repository.JpaRepository
import java.util.UUID

interface UserRepository : JpaRepository<User, UUID> {
    fun findByName(email: String): User?
    fun findByEmail(email: String): User?
}