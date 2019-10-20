package com.wa82bj.bikbike.core.api

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query


internal interface BikeApi {

    @GET("search")
    fun getBikes(
        @Query("serial") serial: String?,
        @Query("manufacturer") manufacturer: String?,
        @Query("page") page: Int,
        @Query("colors[]") color: String?,
        @Query("stolenness") type: String?,
        @Query("location") stolenLocation: String?,
        @Query("per_page") perPage: Int
    ): Call<BikesResponse>
}