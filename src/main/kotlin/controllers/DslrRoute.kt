package com.amr.controllers

import com.amr.Constants
import com.amr.repository.DslrRepository
import io.ktor.http.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.dslrRoute() {
    route(Constants.BASE_URL_V1 + "/dslrs") {
        get {
            call.respond(HttpStatusCode.OK, DslrRepository.getDslr())
        }
    }
}