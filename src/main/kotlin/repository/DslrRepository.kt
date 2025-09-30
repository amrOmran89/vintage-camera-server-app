package com.amr.repository

import com.amr.dto.*

object DslrRepository {

    fun getDslr(): CameraSectionDto {
        return CameraSectionDto(
            title = "DSLRs",
            items = listOf(
                CameraDto(
                    id = 1,
                    brand = "Canon",
                    model = "EOS 5D Mark IV",
                    year = 2016,
                    image = "dslr1",
                    type = CameraType.DSLR,
                    price = 2999.9,
                    currency = Currency.EUR,
                    description = "Professional full-frame DSLR with 30.4 MP sensor and superb low-light performance.",
                    seller = Seller(id = 1, name = "David Müller", ratings = 4.8f)
                ),
                CameraDto(
                    id = 2,
                    brand = "Nikon",
                    model = "D850",
                    year = 2017,
                    image = "dslr2",
                    type = CameraType.DSLR,
                    price = 2799.0,
                    currency = Currency.EUR,
                    description = "High-resolution 45.7 MP DSLR known for excellent dynamic range and rugged build.",
                    seller = Seller(id = 2, name = "Sophie Becker", ratings = 4.6f)
                ),
                CameraDto(
                    id = 3,
                    brand = "Pentax",
                    model = "K-1 Mark II",
                    year = 2018,
                    image = "dslr3",
                    type = CameraType.DSLR,
                    price = 1899.0,
                    currency = Currency.EUR,
                    description = "Full-frame Pentax flagship with Pixel-Shift Resolution and exceptional weather sealing.",
                    seller = Seller(id = 3, name = "Lukas Wagner", ratings = 4.9f)
                ),
                CameraDto(
                    id = 4,
                    brand = "Canon",
                    model = "EOS 6D Mark II",
                    year = 2017,
                    image = "dslr4",
                    type = CameraType.DSLR,
                    price = 1599.0,
                    currency = Currency.EUR,
                    description = "Compact full-frame DSLR with 26 MP sensor and Dual Pixel autofocus.",
                    seller = Seller(id = 4, name = "Anna Schneider", ratings = 4.5f)
                ),
                CameraDto(
                    id = 5,
                    brand = "Nikon",
                    model = "D780",
                    year = 2020,
                    image = "dslr5",
                    type = CameraType.DSLR,
                    price = 1999.0,
                    currency = Currency.EUR,
                    description = "Modern hybrid DSLR with 24 MP sensor and advanced 4K video features.",
                    seller = Seller(id = 5, name = "Jonas Richter", ratings = 4.7f)
                )
            )
        )
    }

    fun getBigDslrList(): List<CameraDto> {
        val items = mutableListOf<CameraDto>()

        val sellers = listOf(
            Seller(id = 1, name = "David Müller", ratings = 4.8f),
            Seller(id = 2, name = "Sophie Becker", ratings = 4.6f),
            Seller(id = 3, name = "Lukas Wagner", ratings = 4.9f),
            Seller(id = 4, name = "Anna Schneider", ratings = 4.5f),
            Seller(id = 5, name = "Jonas Richter", ratings = 4.7f),
            Seller(id = 6, name = "Clara Hoffmann", ratings = 4.7f),
            Seller(id = 7, name = "Felix Weber", ratings = 4.9f)
        )

        // A few real models to rotate through
        val models = listOf(
            "Canon EOS 5D Mark IV",
            "Nikon D850",
            "Pentax K-1 Mark II",
            "Canon EOS 6D Mark II",
            "Nikon D780",
            "Canon EOS 90D",
            "Nikon D7500",
            "Pentax K-3 Mark III",
            "Canon EOS 7D Mark II",
            "Nikon D500"
        )

        // Random descriptions for variety
        val descriptions = listOf(
            "Professional full-frame DSLR with exceptional low-light performance.",
            "High-resolution DSLR with rugged build and outstanding dynamic range.",
            "Compact DSLR with fast autofocus and 4K video support.",
            "Versatile camera for both photography and videography.",
            "Flagship model featuring superb image quality and weather sealing."
        )

        var idCounter = 1
        repeat(50) { index ->
            val brand = when {
                models[index % models.size].contains("Canon", ignoreCase = true) -> "Canon"
                models[index % models.size].contains("Nikon", ignoreCase = true) -> "Nikon"
                models[index % models.size].contains("Pentax", ignoreCase = true) -> "Pentax"
                else -> "Canon"
            }

            items.add(
                CameraDto(
                    id = idCounter++,
                    brand = brand,
                    model = models[index % models.size],
                    year = 2015 + (index % 8), // cycles through 2015–2022
                    image = "dslr${(index % 7) + 1}", // reuse dslr1…dslr7
                    type = CameraType.DSLR,
                    price = 1200.0 + (index % 10) * 100,
                    currency = Currency.EUR,
                    description = descriptions[index % descriptions.size],
                    seller = sellers[index % sellers.size]
                )
            )
        }

        return items
    }
}