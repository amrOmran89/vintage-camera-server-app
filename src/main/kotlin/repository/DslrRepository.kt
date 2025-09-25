package com.amr.repository

import com.amr.dto.DslrDto
import com.amr.dto.DslrSectionDto

object DslrRepository {

    fun getDslr(): DslrSectionDto {
        return DslrSectionDto(
            title = "DSLRs",
            items = listOf(
                DslrDto(id = 1, brand = "Canon", model = "EOS 5D Mark IV", year = 2016, image = "dslr1"),
                DslrDto(id = 2, brand = "Nikon", model = "D850", year = 2017, image = "dslr2"),
                DslrDto(id = 3, brand = "Pentax", model = "K-1 Mark II", year = 2018, image = "dslr3"),
                DslrDto(id = 4, brand = "Canon", model = "EOS 6D Mark II", year = 2017, image = "dslr4"),
                DslrDto(id = 5, brand = "Nikon", model = "D780", year = 2020, image = "dslr5"),
                DslrDto(id = 6, brand = "Sony", model = "Alpha 99 II", year = 2016, image = "dslr6"),
                DslrDto(id = 7, brand = "Fujifilm", model = "X-H1", year = 2018, image = "dslr7")
            )
        )
    }
}