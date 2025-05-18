package com.cineflix.cineflix_backend_service.controller

import com.cineflix.cineflix_backend_service.model.MovieRating
import com.cineflix.cineflix_backend_service.service.MovieRatingService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/ratings")
class MovieRatingController(
    private val movieRatingService: MovieRatingService
) {

    @PostMapping
    fun rateMovie(@RequestBody rating: MovieRating): MovieRating =
        movieRatingService.rateMovie(rating)

    @GetMapping("/movie/{movieName}")
    fun getRatingsForMovie(@PathVariable movieName: String): List<MovieRating> =
        movieRatingService.getRatingsForMovie(movieName)

    @GetMapping("/user/{username}")
    fun getRatingsByUser(@PathVariable username: String): List<MovieRating> =
        movieRatingService.getRatingsByUser(username)

    @GetMapping("/movie/{movieName}/average")
    fun getAverageRating(@PathVariable movieName: String): Double =
        movieRatingService.getAverageRatingForMovie(movieName)
}
