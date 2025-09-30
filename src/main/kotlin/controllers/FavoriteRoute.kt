package com.amr.controllers

import com.amr.dto.FavoriteDto
import com.amr.dto.ResponseDto
import com.amr.repository.FavoriteRepository
import io.ktor.http.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.favoriteRoute(baseUrl: String) {
    route("$baseUrl/favorites") {
        get("/{userId}") {
            call.parameters["userId"]?.let { userId ->
                val favorites = FavoriteRepository.getAllFavorites().filter { it.userId == userId.toInt() }
                call.respond(HttpStatusCode.OK, favorites)
            } ?: run {
                // Handle the case where userId is not provided
                 call.respond(status = HttpStatusCode.BadRequest, message = ResponseDto(message = "Missing or invalid userId", success = false))
            }
        }

        post {
            val body = call.receive<FavoriteDto>()
            FavoriteRepository.addFavorite(body)
            call.respond(HttpStatusCode.Created, message = ResponseDto(message = "Favorite added", success = true))
        }

        delete {
            val body = call.receive<FavoriteDto>()
            FavoriteRepository.removeFavorite(body)
            call.respond(HttpStatusCode.OK, message = ResponseDto(message = "Favorite removed", success = true))
        }
    }
}