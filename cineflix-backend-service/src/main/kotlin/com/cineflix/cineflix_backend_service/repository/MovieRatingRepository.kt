package com.cineflix.cineflix_backend_service.repository

import com.cineflix.cineflix_backend_service.entity.MovieRatingEntity
import org.springframework.data.jpa.repository.JpaRepository

interface MovieRatingRepository : JpaRepository<MovieRatingEntity, Long> {
    fun findByMovieNameIgnoreCase(movieName: String): List<MovieRatingEntity>
    fun findByUsernameIgnoreCase(username: String): List<MovieRatingEntity>
}
