package com.cineflix.cineflix_backend_service.client

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.client.RestTemplate

@Configuration
class WebClient {
    @Bean
    fun restTemplate(): RestTemplate = RestTemplate()
}