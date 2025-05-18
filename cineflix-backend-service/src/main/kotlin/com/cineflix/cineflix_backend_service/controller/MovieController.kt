package com.cineflix.cineflix_backend_service.controller

import com.cineflix.cineflix_backend_service.model.Movie
import com.cineflix.cineflix_backend_service.service.MovieService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/movies")
class MovieController(
    private val movieService: MovieService
) {

    @GetMapping
    fun getAllMovies(): List<Movie> = movieService.getAllMovies()

    @GetMapping("/{name}")
    fun getMovieByName(@PathVariable name: String): Movie? = movieService.getMovieByName(name)
}
