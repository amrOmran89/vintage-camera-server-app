package com.amr.dto

import kotlinx.serialization.Serializable

@Serializable
data class DslrDto(val id: Int, val brand: String, val model: String, val year: Int, val image: String)

@Serializable
data class DslrSectionDto(val title: String, val items: List<DslrDto>)