package com.amr.controllers

import com.amr.repository.OrderRepository
import dto.Order
import io.ktor.http.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.checkoutRoute(baseUrl: String) {
    route("$baseUrl/checkout") {
        post {
            val order = call.receive<Order>()
            OrderRepository.createOrder(order)
            call.respond(HttpStatusCode.Created, "Success")
        }
    }
}