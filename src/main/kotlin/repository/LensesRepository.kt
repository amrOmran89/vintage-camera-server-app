package com.amr.repository

import com.amr.dto.LensDto
import com.amr.dto.LensSectionDto

object LensesRepository {
    fun getTopLenses(): LensSectionDto {
        return LensSectionDto(
            title = "Lenses",
            items = listOf(
                LensDto(id = 1, brand = "Canon",    zoom = "24-70mm f/2.8", image = "lens1"),
                LensDto(id = 2, brand = "Nikon",    zoom = "70-200mm f/2.8", image = "lens2"),
                LensDto(id = 3, brand = "Sony",     zoom = "16-35mm f/4",    image = "lens3"),
                LensDto(id = 4, brand = "Sigma",    zoom = "50-100mm f/1.8", image = "lens4"),
                LensDto(id = 5, brand = "Tamron",   zoom = "28-75mm f/2.8",  image = "lens5"),
                LensDto(id = 6, brand = "Leica",    zoom = "90mm f/2.0",     image = "lens6"),
                LensDto(id = 7, brand = "Fujifilm", zoom = "23mm f/1.4",     image = "lens7")
            )
        )
    }

    fun getAllLenses(): List<LensDto> =
        listOf(
            LensDto(id = 1,  brand = "Canon",    zoom = "24-70mm f/2.8", image = "lens1"),
            LensDto(id = 2,  brand = "Nikon",    zoom = "70-200mm f/2.8", image = "lens2"),
            LensDto(id = 3,  brand = "Sony",     zoom = "16-35mm f/4",    image = "lens3"),
            LensDto(id = 4,  brand = "Sigma",    zoom = "50-100mm f/1.8", image = "lens4"),
            LensDto(id = 5,  brand = "Tamron",   zoom = "28-75mm f/2.8",  image = "lens5"),
            LensDto(id = 6,  brand = "Leica",    zoom = "90mm f/2.0",     image = "lens6"),
            LensDto(id = 7,  brand = "Fujifilm", zoom = "23mm f/1.4",     image = "lens7"),

            LensDto(id = 8,  brand = "Canon",    zoom = "85mm f/1.2",     image = "lens1"),
            LensDto(id = 9,  brand = "Nikon",    zoom = "14-24mm f/2.8",  image = "lens2"),
            LensDto(id = 10, brand = "Sony",     zoom = "24-105mm f/4",   image = "lens3"),
            LensDto(id = 11, brand = "Sigma",    zoom = "35mm f/1.4",     image = "lens4"),
            LensDto(id = 12, brand = "Tamron",   zoom = "17-28mm f/2.8",  image = "lens5"),
            LensDto(id = 13, brand = "Leica",    zoom = "50mm f/1.4",     image = "lens6"),
            LensDto(id = 14, brand = "Fujifilm", zoom = "56mm f/1.2",     image = "lens7"),

            LensDto(id = 15, brand = "Canon",    zoom = "100-400mm f/4.5-5.6", image = "lens1"),
            LensDto(id = 16, brand = "Nikon",    zoom = "105mm f/1.4",          image = "lens2"),
            LensDto(id = 17, brand = "Sony",     zoom = "70-300mm f/4.5-5.6",   image = "lens3"),
            LensDto(id = 18, brand = "Sigma",    zoom = "24-70mm f/2.8 Art",    image = "lens4"),
            LensDto(id = 19, brand = "Tamron",   zoom = "35-150mm f/2-2.8",     image = "lens5"),
            LensDto(id = 20, brand = "Leica",    zoom = "28mm f/2.0",           image = "lens6"),
            LensDto(id = 21, brand = "Fujifilm", zoom = "10-24mm f/4",          image = "lens7"),

            LensDto(id = 22, brand = "Canon",    zoom = "50mm f/1.8",           image = "lens1"),
            LensDto(id = 23, brand = "Nikon",    zoom = "200-500mm f/5.6",      image = "lens2"),
            LensDto(id = 24, brand = "Sony",     zoom = "35mm f/1.4",           image = "lens3"),
            LensDto(id = 25, brand = "Sigma",    zoom = "135mm f/1.8",          image = "lens4"),
            LensDto(id = 26, brand = "Tamron",   zoom = "150-500mm f/5-6.7",    image = "lens5"),
            LensDto(id = 27, brand = "Leica",    zoom = "75mm f/2.0",           image = "lens6"),
            LensDto(id = 28, brand = "Fujifilm", zoom = "80mm f/2.8 Macro",     image = "lens7")
        )

}