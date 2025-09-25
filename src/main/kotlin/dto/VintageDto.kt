package com.amr.dto

import kotlinx.serialization.Serializable

@Serializable
data class VintageDto(
    val id: Int,
    val brand: String,
    val model: String,
    val image: String,
    val price: Double,
    val currency: String,
    val description: String,
    val seller: Seller
)

@Serializable
data class VintageSectionDto(val title: String, val items: List<VintageDto>)
