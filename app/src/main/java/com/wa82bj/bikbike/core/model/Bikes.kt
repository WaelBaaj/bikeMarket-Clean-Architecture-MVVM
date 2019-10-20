package com.wa82bj.bikbike.core.model

data class Bikes(
    val total: Int, val bikes: List<Bike>) {

    data class Bike(
        val id: Int,
        val title: String?,
        val serial: String?,
        val manufacturerName: String?,
        val year: Int?,
        val frameColors: String?,
        val largeImg: String?,
        val stolen: Boolean?,
        val stolenLocation: String?,
        val dateStolen: Int?
    )


    companion object {
        fun empty() = Bikes(0, emptyList())
    }
}