package com.amr.dto

import kotlinx.serialization.Serializable

@Serializable
data class BrandDto(val id: Int, val name: String, val image: String)

@Serializable
data class BrandSectionDto(val title: String, val items: List<BrandDto>)