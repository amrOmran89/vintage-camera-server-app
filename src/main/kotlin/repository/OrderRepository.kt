package com.amr.repository

import dto.Order

object OrderRepository {

    var orders: MutableList<Order> = mutableListOf()
        private set

    fun getAllOrders(): List<Order> = orders

    fun createOrder(order: Order) {
        orders.add(order)
    }
}