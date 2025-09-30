package com.amr.dto

import kotlinx.serialization.Serializable

@Serializable
data class ResponseDto(val message: String, val success: Boolean)
