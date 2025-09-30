package com.amr.dto

import kotlinx.serialization.Serializable

@Serializable
data class FavoriteDto(val userId: Int, val productId: Int)
