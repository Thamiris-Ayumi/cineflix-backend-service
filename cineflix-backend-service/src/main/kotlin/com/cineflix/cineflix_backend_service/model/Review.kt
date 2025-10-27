package com.cineflix.cineflix_backend_service.model

import jakarta.persistence.*
import java.util.UUID

@Entity
data class Review(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: UUID,
    val movieName: String,
    val rating: Double,
    val comment: String
)
