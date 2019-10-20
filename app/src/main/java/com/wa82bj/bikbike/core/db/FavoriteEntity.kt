package com.wa82bj.bikbike.core.db

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "favorite_table")
data class FavoriteEntity(
    @PrimaryKey var id: Int,
    var title: String?,
    var serial: String?,
    var manufacturerName: String?,
    var year: Int?,
    var frameColors: String?,
    var largeImg: String?,
    var stolen: Boolean?,
    var stolenLocation: String?,
    var dateStolen: Int?,
    var registrationCreatedAt: Long?,
    var registrationUpdatedAt: Long?,
    var description: String?,
    var theftDescription: String?,
    var isFavorite: Boolean
)