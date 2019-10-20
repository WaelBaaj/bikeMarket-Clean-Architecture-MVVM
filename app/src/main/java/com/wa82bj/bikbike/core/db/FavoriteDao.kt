package com.wa82bj.bikbike.core.db

import androidx.room.*


@Dao
interface FavoriteDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addToFavorites(favoriteEntity: FavoriteEntity): Long

    @Delete
    fun removeFromFavorites(favoriteEntity: FavoriteEntity): Int

    @Query("SELECT * from favorite_table")
    fun getFavorites(): List<FavoriteEntity>

    @Query("SELECT * from favorite_table where id = :id")
    fun getFavorite(id: Int): FavoriteEntity?

    @Query("SELECT COUNT(*) FROM favorite_table")
    fun getFavoritesCount(): Int
}