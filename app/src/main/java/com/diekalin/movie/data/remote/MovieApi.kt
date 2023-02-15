package com.diekalin.movie.data.remote

import com.diekalin.movie.BuildConfig
import retrofit2.http.GET
import retrofit2.http.Query
import java.text.FieldPosition

interface MovieApi {
    companion object {
        const val BASE_URL = "https://api.themoviedb.org/3/"
        const val API_KEY = BuildConfig.MOVIEDB_API_KEY
    }

    @GET("movie/now_playing?api_key=$API_KEY")
    suspend fun getNowPlayingMovie(
        @Query("page") position: Int
    ) : MovieResponse
}