package com.cineflix.cineflix_backend_service.model

data class MovieResult(
    val page: Int,
    val results: List<Movie>,
    val totalPages: Int,
    val totalResults: Int
)