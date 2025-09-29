package com.amr.dto

import kotlinx.serialization.Serializable

@Serializable
data class CameraDto(
    val id: Int,
    val brand: String,
    val model: String,
    val year: Int,
    val image: String,
    val price: Double,
    val currency: Currency,
    val description: String,
    val seller: Seller,
    val type: CameraType
)

@Serializable
data class CameraSectionDto(val title: String, val items: List<CameraDto>)

@Serializable
enum class CameraType {
    VINTAGE, DSLR, MIRRORLESS, COMPACT, ACTION, MEDIUM_FORMAT
}

@Serializable
enum class Currency {
    EUR, USD
}