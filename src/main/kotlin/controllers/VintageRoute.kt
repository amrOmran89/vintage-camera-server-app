package com.amr.controllers

import com.amr.Constants
import com.amr.repository.VintageRepository
import io.ktor.http.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.vintageRoute() {
    route(Constants.BASE_URL_V1 + "/vintages") {
        get {
            call.respond(HttpStatusCode.OK, VintageRepository.getVintageList())
        }

        get("/all") {
            call.respond(HttpStatusCode.OK, VintageRepository.getAllList())
        }
    }
}