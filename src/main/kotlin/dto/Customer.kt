package com.amr.dto

import kotlinx.serialization.Serializable


@Serializable
data class Customer(val id: Int, val name: String, val email: String, val phone: String)
