package com.cineflix.cineflix_backend_service.controller

import com.cineflix.cineflix_backend_service.model.Movie
import com.cineflix.cineflix_backend_service.service.tmdb.TmdbService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/movies")
class MovieController(
    private val tmdbService: TmdbService
) {
    @GetMapping("/most-popular")
    fun getMostPopular(): ResponseEntity<List<Movie>> {
        val movies = tmdbService.getPopularMovies()
        return ResponseEntity.ok(movies.results)
    }
}
