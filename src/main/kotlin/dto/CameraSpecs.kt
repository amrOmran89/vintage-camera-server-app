package dto

import kotlinx.serialization.Serializable

@Serializable
data class CameraSpecs(
    val id: Int,
    val brand: String,
    val model: String,
    val megapixels: Double,     // e.g. 24.2
    val sensorType: String,     // e.g. "Full Frame", "APS-C", "Micro Four Thirds"
    val isoRange: String,       // e.g. "100–51200"
    val videoResolution: String,// e.g. "4K 30fps"
    val weightGrams: Int,       // in grams
    val description: String
)