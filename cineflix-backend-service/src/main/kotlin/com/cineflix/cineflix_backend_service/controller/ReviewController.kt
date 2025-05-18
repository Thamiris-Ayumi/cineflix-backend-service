package com.cineflix.cineflix_backend_service.controller

import com.cineflix.cineflix_backend_service.model.Review
import com.cineflix.cineflix_backend_service.service.ReviewService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/reviews")
class ReviewController(
    private val reviewService: ReviewService
) {
    @GetMapping
    fun getAllReviews(): List<Review> = reviewService.getAllReviews()

    @GetMapping("/{movieName}")
    fun getReviewsByMovie(@PathVariable movieName: String): List<Review> =
        reviewService.getReviewsByMovie(movieName)

    @PostMapping
    fun addReview(@RequestBody review: Review): Review = reviewService.addReview(review)
}
