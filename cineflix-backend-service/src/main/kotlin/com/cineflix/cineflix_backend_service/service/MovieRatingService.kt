package com.cineflix.cineflix_backend_service.service

import com.cineflix.cineflix_backend_service.model.MovieRating
import org.springframework.stereotype.Service

@Service
class MovieRatingService {

    private val ratings = mutableListOf<MovieRating>()

    fun rateMovie(rating: MovieRating): MovieRating {
        ratings.add(rating)
        return rating
    }

    fun getRatingsForMovie(movieName: String): List<MovieRating> =
        ratings.filter { it.movieName.equals(movieName, ignoreCase = true) }

    fun getRatingsByUser(username: String): List<MovieRating> =
        ratings.filter { it.username.equals(username, ignoreCase = true) }

    fun getAverageRatingForMovie(movieName: String): Double =
        getRatingsForMovie(movieName).map { it.rating }.averageOrNull() ?: 0.0

    private fun List<Double>.averageOrNull(): Double? =
        if (this.isEmpty()) null else this.average()
}
