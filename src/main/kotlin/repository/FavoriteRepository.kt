package com.amr.repository

import com.amr.dto.FavoriteDto

object FavoriteRepository {

    var favorites: MutableList<FavoriteDto> = mutableListOf()
        private set

    fun addFavorite(favorite: FavoriteDto) {
        if (!favorites.any { it.userId == favorite.userId && it.productId == favorite.productId }) {
            favorites.add(favorite)
        }
    }

    fun removeFavorite(favorite: FavoriteDto) {
        favorites.removeAll { it == favorite }
    }

    fun getAllFavorites(): List<FavoriteDto> = favorites
}