package dto

import com.amr.dto.Currency
import com.amr.dto.Customer
import com.amr.dto.Seller
import kotlinx.serialization.Serializable


@Serializable
data class Order(
    val id: Int,
    val seller: Seller,
    val customer: Customer,
    val totalAmount: Double,
    val currency: Currency,
    val status: OrderStatus,
    val createdAt: String,
    val shippingAddress: String
)


@Serializable
enum class OrderStatus {
    PENDING,
    PROCESSING,
    SHIPPED,
    DELIVERED,
    CANCELLED
}