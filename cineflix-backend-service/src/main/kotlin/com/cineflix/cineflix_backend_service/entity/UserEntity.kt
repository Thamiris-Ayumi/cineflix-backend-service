package com.cineflix.cineflix_backend_service.entity

import jakarta.persistence.*
import java.time.LocalDateTime
import java.util.UUID

@Entity
@Table(name = "user")
data class UserEntity(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: UUID,
    val name: String,
    val email: String,
    val password: String,
    val createdAt: LocalDateTime = LocalDateTime.now()
)