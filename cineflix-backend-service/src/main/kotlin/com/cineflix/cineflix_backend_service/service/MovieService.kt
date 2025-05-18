package com.cineflix.cineflix_backend_service.service

import com.cineflix.cineflix_backend_service.model.Movie
import org.springframework.stereotype.Service

@Service
class MovieService {

    private val movies = listOf(
        Movie("Interstellar", "https://image.tmdb.org/t/p/w500/gEU2QniE6E77NI6lCU6MxlNBvIx.jpg"),
        Movie("Inception", "https://image.tmdb.org/t/p/w500/9gk7adHYeDvHkCSEqAvQNLV5Uge.jpg"),
        Movie("The Dark Knight", "https://image.tmdb.org/t/p/w500/qJ2tW6WMUDux911r6m7haRef0WH.jpg"),
        Movie("The Matrix", "https://image.tmdb.org/t/p/w500/f89U3ADr1oiB1s9GkdPOEpXUk5H.jpg"),
        Movie("The Lord of the Rings", "https://image.tmdb.org/t/p/w500/56zTpe2xvaA4alU51sRWPoKPYZy.jpg"),
        Movie("Black Panther", "https://image.tmdb.org/t/p/w500/uxzzxijgPIY7slzFvMotPv8wjKA.jpg"),
        Movie("Fight Club", "https://image.tmdb.org/t/p/w500/bptfVGEQuv6vDTIMVCHjJ9Dz8PX.jpg"),
        Movie("Forrest Gump", "https://image.tmdb.org/t/p/w500/saHP97rTPS5eLmrLQEcANmKrsFl.jpg"),
        Movie("The Lion King", "https://image.tmdb.org/t/p/w500/2bXbqYdUdNVa8VIWXVfclP2ICtT.jpg"),
        Movie("Dune", "https://image.tmdb.org/t/p/w500/d5NXSklXo0qyIYkgV94XAgMIckC.jpg"),
        Movie("Titanic", "https://image.tmdb.org/t/p/w500/9xjZS2rlVxm8SFx8kPC3aIGCOYQ.jpg"),
        Movie("Jurassic Park", "https://image.tmdb.org/t/p/w500/9i3plLl89DHMz7mahksDaAo7HIS.jpg"),
        Movie("The Avengers", "https://image.tmdb.org/t/p/w500/RYMX2wcKCBAr24UyPD7xwmjaTn.jpg"),
        Movie("Iron Man", "https://image.tmdb.org/t/p/w500/78lPtwv72eTNqFW9COBYI0dWDJa.jpg"),
        Movie("Spider-Man No Way Home", "https://image.tmdb.org/t/p/w500/1g0dhYtq4irTY1GPXvft6k4YLjm.jpg"),
        Movie("Deadpool", "https://image.tmdb.org/t/p/w500/fSRb7vyIP8rQpL0I47P3qUsEKX3.jpg"),
        Movie("Shrek", "https://image.tmdb.org/t/p/w500/iB64vpL3dIObOtMZgX3RqdVdQDc.jpg"),
        Movie("Frozen", "https://image.tmdb.org/t/p/w500/kgwjIb2JDHRhNk13lmSxiClFjVk.jpg"),
        Movie("Top Gun: Maverick", "https://image.tmdb.org/t/p/w500/62HCnUTziyWcpDaBO2i1DX17ljH.jpg"),
        Movie("Coco", "https://image.tmdb.org/t/p/w500/gGEsBPAijhVUFoiNpgZXqRVWJt2.jpg")
    )

    fun getAllMovies(): List<Movie> = movies

    fun getMovieByName(name: String): Movie? =
        movies.find { it.name.equals(name, ignoreCase = true) }
}
