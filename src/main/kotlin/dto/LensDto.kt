package com.amr.dto

import kotlinx.serialization.Serializable

@Serializable
data class LensDto(val id: Int, val brand: String, val zoom: String, val image: String)

@Serializable
data class LensSectionDto(val title: String, val items: List<LensDto>)