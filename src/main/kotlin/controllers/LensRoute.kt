package com.amr.controllers

import com.amr.Constants
import com.amr.repository.LensesRepository
import io.ktor.http.*
import io.ktor.server.response.*
import io.ktor.server.routing.*


fun Route.lensRoute() {
    route(Constants.BASE_URL_V1 + "/lenses") {
        get("/top") {
            call.respond(HttpStatusCode.OK, LensesRepository.getTopLenses())
        }

        get("/all") {
            call.respond(HttpStatusCode.OK, LensesRepository.getAllLenses())
        }
    }
}