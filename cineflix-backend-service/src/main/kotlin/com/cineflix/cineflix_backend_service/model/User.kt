package com.cineflix.cineflix_backend_service.model

import java.util.UUID

data class User(
    val id: UUID,
    var name: String,
    var email: String,
    var password: String
)
