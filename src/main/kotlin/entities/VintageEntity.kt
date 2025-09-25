package entities

import org.jetbrains.exposed.dao.id.IntIdTable

object VintageEntity: IntIdTable("vintage") {
    val name = varchar("name", 255)
    val year = integer("year")
    val brandId = integer("brand_id")
    val lensId = integer("lens_id")
}