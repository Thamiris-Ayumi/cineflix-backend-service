package com.cineflix.cineflix_backend_service.service

import com.cineflix.cineflix_backend_service.model.Review
import com.cineflix.cineflix_backend_service.repository.ReviewRepository
import org.springframework.stereotype.Service

@Service
class ReviewService(private val reviewRepository: ReviewRepository) {

    fun getAllReviews(): List<Review> = reviewRepository.findAll()

    fun getReviewsByMovie(movieName: String): List<Review> =
        reviewRepository.findAllByMovieName(movieName)

    fun addReview(review: Review): Review = reviewRepository.save(review)
}
