package com.curymorais.twitchtop100

import com.curymorais.twitchtop100.data.domain.TopGames
import retrofit2.Call
import retrofit2.http.GET

interface TwitchService {

    @GET("games/top?limit=100&client_id=mz5yy4jgtkvvhuh8almyjzctsjgyyp")
    fun getTop100Games() : Call<TopGames>

//    @Headers("Accept: application/vnd.twitchtv.v5+json")
//    @GET("games/top?limit=100&client_id=mz5yy4jgtkvvhuh8almyjzctsjgyyp")
//    abstract fun getTopGames(): Call<TopGames>
//
//    @GET("games/top/?client_id=mz5yy4jgtkvvhuh8almyjzctsjgyyp")
//    abstract fun getTopGamesData(): Call<TopGames>

}