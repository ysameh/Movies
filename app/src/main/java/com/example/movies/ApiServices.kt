package com.example.movies

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiServices {

    @GET("movie/popular")
    fun getPopularMovies(
        @Query("api_key") apiKey : String = "fd6f9b0ab530314b31aca86ea3df8e97",
        @Query("page") pageNumber: Int = 1
    ) : Call<MoviesResponse>
}