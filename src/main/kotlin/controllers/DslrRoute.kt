package com.amr.controllers

import com.amr.repository.DslrRepository
import io.ktor.http.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.dslrRoute(baseUrl: String) {
    route("$baseUrl/dslr") {
        get("/section") {
            call.respond(HttpStatusCode.OK, DslrRepository.getDslr())
        }

        get("/all") {
            call.respond(HttpStatusCode.OK, DslrRepository.getBigDslrList())
        }
    }
}