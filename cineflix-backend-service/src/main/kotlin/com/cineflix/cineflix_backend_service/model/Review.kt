package com.cineflix.cineflix_backend_service.model

import jakarta.persistence.*

@Entity
data class Review(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
    val movieName: String,
    val rating: Double,
    val comment: String
)
