package com.amr.controllers

import com.amr.repository.BrandsRepository
import io.ktor.http.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.brandRoute(baseUrl: String) {
    route("$baseUrl/brands") {
        get("/top") {
            call.respond(HttpStatusCode.OK, BrandsRepository.getTopBrands())
        }

        get("/all") {
            call.respond(HttpStatusCode.OK, BrandsRepository.getAllBrands())
        }
    }
}