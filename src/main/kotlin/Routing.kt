package com.amr

import com.amr.controllers.*
import io.ktor.server.application.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        lensRoute()
        brandRoute()
        vintageRoute()
        dslrRoute()
        checkoutRoute()
    }
}
