package com.cineflix.cineflix_backend_service.model

import java.time.LocalDateTime

data class MovieRating(
    val movieName: String,
    val username: String,
    val rating: Double,
    val review: String? = null,
    val createdAt: LocalDateTime = LocalDateTime.now()
)
