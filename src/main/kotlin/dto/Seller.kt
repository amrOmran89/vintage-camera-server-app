package com.amr.dto

import kotlinx.serialization.Serializable

@Serializable
data class Seller(val id: Int, val name: String, val ratings: Float)
