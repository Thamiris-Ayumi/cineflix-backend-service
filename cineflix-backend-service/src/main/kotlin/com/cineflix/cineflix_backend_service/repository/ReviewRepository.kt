package com.cineflix.cineflix_backend_service.repository

import com.cineflix.cineflix_backend_service.model.Review
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ReviewRepository : JpaRepository<Review, Long> {
    fun findAllByMovieName(movieName: String): List<Review>
}
