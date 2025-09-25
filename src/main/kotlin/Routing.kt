package com.amr

import com.amr.controllers.brandRoute
import com.amr.controllers.dslrRoute
import com.amr.controllers.lensRoute
import com.amr.controllers.vintageRoute
import io.ktor.server.application.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        lensRoute()
        brandRoute()
        vintageRoute()
        dslrRoute()
    }
}
