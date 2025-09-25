package com.amr.repository

import com.amr.dto.Seller
import com.amr.dto.VintageDto
import com.amr.dto.VintageSectionDto

object VintageRepository {
    fun getVintageList(): VintageSectionDto {
        return VintageSectionDto(
            title = "Vintage Cameras",
            items = listOf(
                VintageDto(
                    id = 1,
                    brand = "Canon",
                    model = "FD 50mm f/1.4",
                    image = "vintage1",
                    price = 199.99,
                    currency = "EUR",
                    description = "Fast standard prime from the Canon FD era with classic rendering.",
                    seller = Seller(id = 1, name = "David Müller", ratings = 4.8f)
                ),
                VintageDto(
                    id = 2,
                    brand = "Nikon",
                    model = "Nikkor 35mm f/2",
                    image = "vintage2",
                    price = 149.99,
                    currency = "EUR",
                    description = "Compact Nikon wide with pleasing contrast and character.",
                    seller = Seller(id = 2, name = "Sophie Becker", ratings = 4.6f)
                ),
                VintageDto(
                    id = 3,
                    brand = "Leica",
                    model = "Summicron 50mm",
                    image = "vintage3",
                    price = 299.99,
                    currency = "EUR",
                    description = "Leica 50mm renowned for micro-contrast and crisp detail.",
                    seller = Seller(id = 3, name = "Lukas Wagner", ratings = 4.9f)
                ),
                VintageDto(
                    id = 4,
                    brand = "Pentax",
                    model = "Super Takumar 55mm",
                    image = "vintage4",
                    price = 129.99,
                    currency = "EUR",
                    description = "Warm vintage tones and smooth bokeh from the Takumar line.",
                    seller = Seller(id = 4, name = "Anna Schneider", ratings = 4.5f)
                ),
                VintageDto(
                    id = 5,
                    brand = "Olympus",
                    model = "Zuiko 28mm f/3.5",
                    image = "vintage5",
                    price = 89.99,
                    currency = "EUR",
                    description = "Lightweight Zuiko wide-angle ideal for travel and street.",
                    seller = Seller(id = 5, name = "Jonas Richter", ratings = 4.4f)
                ),
                VintageDto(
                    id = 6,
                    brand = "Minolta",
                    model = "Rokkor 58mm f/1.4",
                    image = "vintage6",
                    price = 159.99,
                    currency = "EUR",
                    description = "Minolta classic with dreamy bokeh and gentle rendering.",
                    seller = Seller(id = 6, name = "Clara Hoffmann", ratings = 4.7f)
                )
            )
        )
    }

    fun getAllList(): List<VintageDto> {
        return listOf(
            VintageDto(1,"Canon","FD 50mm f/1.4","vintage1",199.99,"EUR","Fast standard prime from the Canon FD era with classic rendering.", Seller(1,"David Müller",4.8f)),
            VintageDto(2,"Nikon","Nikkor 35mm f/2","vintage2",149.99,"EUR","Compact Nikon wide with pleasing contrast and character.", Seller(2,"Sophie Becker",4.6f)),
            VintageDto(3,"Leica","Summicron 50mm f/2","vintage3",299.99,"EUR","Leica 50mm renowned for micro-contrast and crisp detail.", Seller(3,"Lukas Wagner",4.9f)),
            VintageDto(4,"Pentax","Super Takumar 55mm f/1.8","vintage4",129.99,"EUR","Warm vintage tones and smooth bokeh from the Takumar line.", Seller(4,"Anna Schneider",4.5f)),
            VintageDto(5,"Olympus","Zuiko 28mm f/3.5","vintage5",89.99,"EUR","Lightweight Zuiko wide-angle ideal for travel and street.", Seller(5,"Jonas Richter",4.4f)),
            VintageDto(6,"Minolta","Rokkor 58mm f/1.4","vintage6",159.99,"EUR","Minolta classic with dreamy bokeh and gentle rendering.", Seller(6,"Clara Hoffmann",4.7f)),
            VintageDto(7,"Canon","FL 35mm f/2.5","vintage1",119.99,"EUR","Compact Canon FL wide with vintage contrast.", Seller(1,"David Müller",4.8f)),
            VintageDto(8,"Nikon","Series E 50mm f/1.8","vintage2",99.99,"EUR","Nifty fifty from the Series E line—lightweight and sharp.", Seller(2,"Sophie Becker",4.6f)),
            VintageDto(9,"Leica","Elmar 90mm f/4","vintage3",249.99,"EUR","Classic telephoto with smooth rendering and gentle contrast.", Seller(3,"Lukas Wagner",4.9f)),
            VintageDto(10,"Pentax","SMC 35mm f/3.5","vintage4",79.99,"EUR","SMC coatings provide crisp contrast and flare resistance.", Seller(4,"Anna Schneider",4.5f)),
            VintageDto(11,"Olympus","Zuiko 50mm f/1.8","vintage5",109.99,"EUR","Reliable everyday fifty with clean, neutral rendering.", Seller(5,"Jonas Richter",4.4f)),
            VintageDto(12,"Minolta","MC Rokkor 35mm f/2.8","vintage6",89.99,"EUR","Solid Minolta wide-angle for street and landscapes.", Seller(6,"Clara Hoffmann",4.7f)),
            VintageDto(13,"Contax","Zeiss Planar 50mm f/1.7","vintage1",349.99,"EUR","Zeiss Planar signature pop and micro-contrast.", Seller(7,"Felix Weber",4.9f)),
            VintageDto(14,"Canon","FD 135mm f/2.5","vintage2",179.99,"EUR","Telephoto portrait lens with pleasing compression and bokeh.", Seller(1,"David Müller",4.8f)),
            VintageDto(15,"Nikon","Micro-Nikkor 55mm f/3.5","vintage3",199.99,"EUR","Macro-capable standard reaching 1:2 magnification with adapters.", Seller(2,"Sophie Becker",4.6f)),
            VintageDto(16,"Leica","Summilux 35mm f/1.4","vintage4",399.99,"EUR","Iconic fast 35mm with characterful wide-open look.", Seller(3,"Lukas Wagner",4.9f)),
            VintageDto(17,"Pentax","Super Takumar 135mm f/3.5","vintage5",149.99,"EUR","Compact 135mm with classic tones and smooth backgrounds.", Seller(4,"Anna Schneider",4.5f)),
            VintageDto(18,"Olympus","Zuiko 135mm f/3.5","vintage6",129.99,"EUR","Lightweight telephoto ideal for travel and portraits.", Seller(5,"Jonas Richter",4.4f)),
            VintageDto(19,"Minolta","MC Rokkor 85mm f/1.7","vintage1",159.99,"EUR","Classic portrait focal length with creamy bokeh.", Seller(6,"Clara Hoffmann",4.7f)),
            VintageDto(20,"Contax","Zeiss Sonnar 135mm f/2.8","vintage2",299.99,"EUR","Zeiss Sonnar telephoto with strong contrast and color.", Seller(7,"Felix Weber",4.9f))
        )
    }
}