package com.cineflix.cineflix_backend_service.model

import java.util.UUID

data class Movie(
    val id: UUID,
    val title: String,
    val overview: String,
    val posterPath: String?,
    val releaseDate: String
)