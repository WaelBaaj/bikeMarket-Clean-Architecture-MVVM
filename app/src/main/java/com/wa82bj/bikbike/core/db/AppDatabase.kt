package com.wa82bj.bikbike.core.db

import androidx.room.Database
import androidx.room.RoomDatabase


@Database(
    entities = [FavoriteEntity::class],
    version = 1,
    exportSchema = false)
abstract class AppDatabase : RoomDatabase() {

    companion object {
        const val DB_NAME = "bike_database"
    }

    abstract fun favoriteDao(): FavoriteDao
}