package com.wa82bj.bikbike.core.api

import com.google.gson.annotations.SerializedName
import com.wa82bj.bikbike.core.model.Bikes

data class BikesResponse(
    @SerializedName("bikes")
    private val bikesResponse: List<BikeResponse>) {


    data class BikeResponse(
        @SerializedName("id")
        private val id: Int,
        @SerializedName("title")
        private val title: String?,
        @SerializedName("serial")
        private val serial: String?,
        @SerializedName("manufacturer_name")
        private val manufacturerName: String?,
        @SerializedName("year") private
        val year: Int?,
        @SerializedName("frame_colors")
        private val frameColors: List<String>?,
        @SerializedName("large_img")
        private val largeImg: String?,
        @SerializedName("stolen")
        private val stolen: Boolean?,
        @SerializedName("stolen_location")
        private val stolenLocation: String?,
        @SerializedName("date_stolen")
        private val dateStolen: Int
    ) {

        fun toBike() = Bikes.Bike(
            id,
            title,
            serial,
            manufacturerName,
            year,
            frameColors?.joinToString(),
            largeImg,
            stolen,
            stolenLocation.takeIf {
                !it.isNullOrEmpty() }?.split(",")?.joinToString(),
            dateStolen
        )
    }

    fun toBikes(total: Int) = Bikes(total, bikesResponse.map {
        it.toBike()
    })
}