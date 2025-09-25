package com.amr.repository

import com.amr.dto.BrandDto
import com.amr.dto.BrandSectionDto

object BrandsRepository {

    fun getTopBrands(): BrandSectionDto {
        return BrandSectionDto(
            title = "Top Brands",
            items = listOf(
                BrandDto(id = 1, name = "Canon", image = "brand_canon"),
                BrandDto(id = 2, name = "Nikon", image = "brand_nikon"),
                BrandDto(id = 3, name = "Sony", image = "brand_sony"),
                BrandDto(id = 4, name = "Pentax", image = "brand_pentax"),
                BrandDto(id = 5, name = "Fujifilm", image = "brand_fujifilm"),
                BrandDto(id = 6, name = "Leica", image = "brand_leica")
            )
        )
    }

    fun getAllBrands(): List<BrandDto> {
        return listOf(
            BrandDto(id = 1,  name = "Canon", image = "brand_canon"),
            BrandDto(id = 2,  name = "Nikon", image = "brand_nikon"),
            BrandDto(id = 3,  name = "Sony", image = "brand_sony"),
            BrandDto(id = 4,  name = "Pentax", image = "brand_pentax"),
            BrandDto(id = 5,  name = "Fujifilm", image = "brand_fujifilm"),
            BrandDto(id = 6,  name = "Leica", image = "brand_leica"),
            BrandDto(id = 7,  name = "Olympus", image = "brand_olympus"),
            BrandDto(id = 8,  name = "Panasonic", image = "brand_panasonic"),
            BrandDto(id = 9,  name = "Kodak", image = "brand_kodak"),
            BrandDto(id = 10, name = "Hasselblad", image = "brand_hasselblad"),
            BrandDto(id = 11, name = "Phase One", image = "brand_phaseone"),
            BrandDto(id = 12, name = "Sigma", image = "brand_sigma"),
            BrandDto(id = 13, name = "Tamron", image = "brand_tamron"),
            BrandDto(id = 14, name = "Zeiss", image = "brand_zeiss"),
            BrandDto(id = 15, name = "Ricoh", image = "brand_ricoh"),
            BrandDto(id = 16, name = "Minolta", image = "brand_minolta"),
            BrandDto(id = 17, name = "Polaroid", image = "brand_polaroid"),
            BrandDto(id = 18, name = "GoPro", image = "brand_gopro"),
            BrandDto(id = 19, name = "DJI", image = "brand_dji"),
            BrandDto(id = 20, name = "Lumix", image = "brand_lumix"),
            BrandDto(id = 21, name = "Blackmagic", image = "brand_blackmagic"),
            BrandDto(id = 22, name = "RED", image = "brand_red"),
            BrandDto(id = 23, name = "Arri", image = "brand_arri"),
            BrandDto(id = 24, name = "Pentacon", image = "brand_pentacon"),
            BrandDto(id = 25, name = "Yashica", image = "brand_yashica")
        )
    }
}