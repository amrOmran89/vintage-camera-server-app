package com.amr.repository

import com.amr.dto.*

object VintageRepository {

    fun getVintageList(): CameraSectionDto {
        return CameraSectionDto(
            title = "Vintage Cameras",
            items = listOf(
                CameraDto(
                    id = 3,
                    brand = "Leica",
                    model = "Summicron 50mm",
                    image = "vintage3",
                    price = 299.99,
                    currency = Currency.EUR,
                    description = "Leica 50mm renowned for micro-contrast and crisp detail.",
                    seller = Seller(id = 3, name = "Lukas Wagner", ratings = 4.9f),
                    type = CameraType.VINTAGE,
                    year = 1960
                ),
                CameraDto(
                    id = 4,
                    brand = "Pentax",
                    model = "Super Takumar 55mm",
                    image = "vintage4",
                    price = 129.99,
                    currency = Currency.EUR,
                    description = "Warm vintage tones and smooth bokeh from the Takumar line.",
                    seller = Seller(id = 4, name = "Anna Schneider", ratings = 4.5f),
                    type = CameraType.VINTAGE,
                    year = 1968
                ),
                CameraDto(
                    id = 5,
                    brand = "Olympus",
                    model = "Zuiko 28mm f/3.5",
                    image = "vintage5",
                    price = 89.99,
                    currency = Currency.EUR,
                    description = "Lightweight Zuiko wide-angle ideal for travel and street.",
                    seller = Seller(id = 5, name = "Jonas Richter", ratings = 4.4f),
                    type = CameraType.VINTAGE,
                    year = 1973
                ),
                CameraDto(
                    id = 6,
                    brand = "Minolta",
                    model = "Rokkor 58mm f/1.4",
                    image = "vintage6",
                    price = 159.99,
                    currency = Currency.EUR,
                    description = "Minolta classic with dreamy bokeh and gentle rendering.",
                    seller = Seller(id = 6, name = "Clara Hoffmann", ratings = 4.7f),
                    type = CameraType.VINTAGE,
                    year = 1969
                )
            )
        )
    }

    fun getAllList(): List<CameraDto> {
        return listOf(
            CameraDto(id =1, brand ="Canon", model = "FD 50mm f/1.4", image = "vintage1", price = 199.99, currency = Currency.EUR, description = "Fast standard prime from the Canon FD era with classic rendering.", seller = Seller(1,"David Müller",4.8f), type = CameraType.VINTAGE,year = 1979),
            CameraDto(id =2, brand ="Nikon", model = "Nikkor 35mm f/2", image = "vintage2", price = 149.99, currency = Currency.EUR, description = "Compact Nikon wide with pleasing contrast and character.", seller = Seller(2,"Sophie Becker",4.6f), type = CameraType.VINTAGE,year = 1975),
            CameraDto(id =3, brand ="Leica", model = "Summicron 50mm f/2", image = "vintage3", price = 299.99, currency = Currency.EUR, description = "Leica 50mm renowned for micro-contrast and crisp detail.", seller = Seller(3,"Lukas Wagner",4.9f), type = CameraType.VINTAGE,year = 1960),
            CameraDto(id =4, brand ="Pentax", model = "Super Takumar 55mm f/1.8", image = "vintage4", price = 129.99, currency = Currency.EUR, description = "Warm vintage tones and smooth bokeh from the Takumar line.", seller = Seller(4,"Anna Schneider",4.5f), type = CameraType.VINTAGE,year = 1968),
            CameraDto(id =5, brand ="Olympus", model = "Zuiko 28mm f/3.5", image = "vintage5", price = 89.99, currency = Currency.EUR, description = "Lightweight Zuiko wide-angle ideal for travel and street.", seller = Seller(5,"Jonas Richter",4.4f), type = CameraType.VINTAGE,year = 1973),
            CameraDto(id =6, brand ="Minolta", model = "Rokkor 58mm f/1.4", image = "vintage6", price = 159.99, currency = Currency.EUR, description = "Minolta classic with dreamy bokeh and gentle rendering.", seller = Seller(6,"Clara Hoffmann",4.7f), type = CameraType.VINTAGE,year = 1969),
            CameraDto(id =7, brand ="Canon", model = "FL 35mm f/2.5", image = "vintage1", price = 119.99, currency = Currency.EUR, description = "Compact Canon FL wide with vintage contrast.", seller = Seller(1,"David Müller",4.8f), type = CameraType.VINTAGE,year = 1965),
            CameraDto(id =8, brand ="Nikon", model = "Series E 50mm f/1.8", image = "vintage2", price = 99.99, currency = Currency.EUR, description = "Nifty fifty from the Series E line—lightweight and sharp.", seller = Seller(2,"Sophie Becker",4.6f), type = CameraType.VINTAGE,year = 1980),
            CameraDto(id =9, brand ="Leica", model = "Elmar 90mm f/4", image = "vintage3", price = 249.99, currency = Currency.EUR, description = "Classic telephoto with smooth rendering and gentle contrast.", seller = Seller(3,"Lukas Wagner",4.9f), type = CameraType.VINTAGE,year = 1954),
            CameraDto(id =10, brand ="Pentax", model = "SMC 35mm f/3.5", image = "vintage4", price = 79.99, currency = Currency.EUR, description = "SMC coatings provide crisp contrast and flare resistance.", seller = Seller(4,"Anna Schneider",4.5f), type = CameraType.VINTAGE,year = 1971),
            CameraDto(id =11, brand ="Olympus", model = "Zuiko 50mm f/1.8", image = "vintage5", price = 109.99, currency = Currency.EUR, description = "Reliable everyday fifty with clean, neutral rendering.", seller = Seller(5,"Jonas Richter",4.4f), type = CameraType.VINTAGE,year = 1979),
            CameraDto(id =12, brand ="Minolta", model = "MC Rokkor 35mm f/2.8", image = "vintage6", price = 89.99, currency = Currency.EUR, description = "Solid Minolta wide-angle for street and landscapes.", seller = Seller(6,"Clara Hoffmann",4.7f), type = CameraType.VINTAGE,year = 1973),
            CameraDto(id =13, brand ="Contax", model = "Zeiss Planar 50mm f/1.7", image = "vintage1", price = 349.99, currency = Currency.EUR, description = "Zeiss Planar signature pop and micro-contrast.", seller = Seller(7,"Felix Weber",4.9f), type = CameraType.VINTAGE,year = 1975),
            CameraDto(id =14, brand ="Canon", model = "FD 135mm f/2.5", image = "vintage2", price = 179.99, currency = Currency.EUR, description = "Telephoto portrait lens with pleasing compression and bokeh.", seller = Seller(1,"David Müller",4.8f), type = CameraType.VINTAGE,year = 1976),
            CameraDto(id =15, brand ="Nikon", model = "Micro-Nikkor 55mm f/3.5", image = "vintage3", price = 199.99, currency = Currency.EUR, description = "Macro-capable standard reaching 1:2 magnification with adapters.", seller = Seller(2,"Sophie Becker",4.6f), type = CameraType.VINTAGE,year = 1973),
            CameraDto(id =16, brand ="Leica", model = "Summilux 35mm f/1.4", image = "vintage4", price = 399.99, currency = Currency.EUR, description = "Iconic fast 35mm with characterful wide-open look.", seller = Seller(3,"Lukas Wagner",4.9f), type = CameraType.VINTAGE,year = 1961),
            CameraDto(id =17, brand ="Pentax", model = "Super Takumar 135mm f/3.5", image = "vintage5", price = 149.99, currency = Currency.EUR, description = "Compact 135mm with classic tones and smooth backgrounds.", seller = Seller(4,"Anna Schneider",4.5f), type = CameraType.VINTAGE,year = 1970),
            CameraDto(id =18, brand ="Olympus", model = "Zuiko 135mm f/3.5", image = "vintage6", price = 129.99, currency = Currency.EUR, description = "Lightweight telephoto ideal for travel and portraits.", seller = Seller(5,"Jonas Richter",4.4f), type = CameraType.VINTAGE,year = 1974),
            CameraDto(id =19, brand ="Minolta", model = "MC Rokkor 85mm f/1.7", image = "vintage1", price = 159.99, currency = Currency.EUR, description = "Classic portrait focal length with creamy bokeh.", seller = Seller(6,"Clara Hoffmann",4.7f), type = CameraType.VINTAGE,year = 1972),
            CameraDto(id =20, brand ="Contax", model = "Zeiss Sonnar 135mm f/2.8", image = "vintage2", price = 299.99, currency = Currency.EUR, description = "Zeiss Sonnar telephoto with strong contrast and color.", seller = Seller(7,"Felix Weber",4.9f), type = CameraType.VINTAGE,year = 1973),
        )
    }
}