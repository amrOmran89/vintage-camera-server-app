package com.amr

import com.amr.controllers.*
import io.ktor.server.application.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        lensRoute(Constants.BASE_URL_V1)
        brandRoute(Constants.BASE_URL_V1)
        vintageRoute(Constants.BASE_URL_V1)
        dslrRoute(Constants.BASE_URL_V1)
        checkoutRoute(Constants.BASE_URL_V1)
        favoriteRoute(Constants.BASE_URL_V1)
    }
}
