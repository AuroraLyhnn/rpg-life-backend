package com.aurora_lyhnn.rpg_life.mapper;

import com.aurora_lyhnn.rpg_life.dto.OutfitInputDto;
import com.aurora_lyhnn.rpg_life.dto.OutfitOutputDto;
import com.aurora_lyhnn.rpg_life.model.Outfit;

public class OutfitMapper {

    public static Outfit toEntity(OutfitInputDto outfitInputDto) {
        Outfit outfit = new Outfit();
        outfit.setHair(outfitInputDto.hair);
        outfit.setWeapon(outfitInputDto.weapon);
        outfit.setClothing(outfitInputDto.clothing);
        outfit.setShoes(outfitInputDto.shoes);
        outfit.setHeadAccessory(outfitInputDto.headAccessory);
        outfit.setWings(outfitInputDto.wings);

        return outfit;
    }

    public static OutfitOutputDto toDto(Outfit outfit) {
        OutfitOutputDto outfitOutputDto = new OutfitOutputDto();
        outfitOutputDto.hair = outfit.getHair();
        outfitOutputDto.weapon = outfit.getClothing();
        outfitOutputDto.clothing = outfit.getShoes();
        outfitOutputDto.shoes = outfit.getHeadAccessory();
        outfitOutputDto.headAccessory = outfit.getWings();
        outfitOutputDto.wings = outfit.getShoes();

        return outfitOutputDto;
    }
}
