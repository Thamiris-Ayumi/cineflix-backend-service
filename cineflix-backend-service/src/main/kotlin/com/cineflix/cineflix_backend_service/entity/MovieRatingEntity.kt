package com.cineflix.cineflix_backend_service.entity

import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
@Table(name = "movie_rating")
data class MovieRatingEntity(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
    val movieName: String,
    val username: String,
    val rating: Double,
    val review: String? = null,
    val createdAt: LocalDateTime = LocalDateTime.now()
)
