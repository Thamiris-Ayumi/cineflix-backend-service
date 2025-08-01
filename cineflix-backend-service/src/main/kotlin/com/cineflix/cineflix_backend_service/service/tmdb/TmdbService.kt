package com.cineflix.cineflix_backend_service.service.tmdb

import com.cineflix.cineflix_backend_service.model.MovieResult
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate

@Service
class TmdbService(
    @Value("\${tmdb.api-key}") private val apiKey: String,
    @Value("\${tmdb.base-url}") private val baseUrl: String,
    private val restTemplate: RestTemplate
) {
    fun getPopularMovies(): MovieResult {
        val url = "$baseUrl/movie/popular?api_key=$apiKey&language=pt-BR&page=1"
        val response = restTemplate.getForEntity(url, MovieResult::class.java)
        return response.body ?: throw RuntimeException("Error getting movies.")
    }
}
