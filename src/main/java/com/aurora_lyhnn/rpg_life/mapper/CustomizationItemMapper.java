package com.aurora_lyhnn.rpg_life.mapper;

import com.aurora_lyhnn.rpg_life.dto.CustomizationItemInputDto;
import com.aurora_lyhnn.rpg_life.dto.CustomizationItemOutputDto;
import com.aurora_lyhnn.rpg_life.model.CustomizationItem;

public class CustomizationItemMapper {

    public static CustomizationItem toEntity(CustomizationItemInputDto customizationItemInputDto) {
        CustomizationItem customizationItem = new CustomizationItem();
        customizationItem.setItemType(customizationItemInputDto.itemType);
        customizationItem.setName(customizationItemInputDto.name);
        customizationItem.setItemPart(customizationItemInputDto.itemPart);
        customizationItem.setImageUrl(customizationItemInputDto.imageUrl);
        customizationItem.setJob(customizationItemInputDto.job);
        customizationItem.setUnlocked(customizationItemInputDto.unlocked);
        customizationItem.setPrice(customizationItemInputDto.price);

        return customizationItem;
    }

    public static CustomizationItemOutputDto toDto(CustomizationItem customizationItem) {
        CustomizationItemOutputDto customizationItemOutputDto = new CustomizationItemOutputDto();
        customizationItemOutputDto.itemType = customizationItem.getItemType();
        customizationItemOutputDto.name = customizationItem.getName();
        customizationItemOutputDto.itemPart = customizationItem.getItemPart();
        customizationItemOutputDto.imageUrl = customizationItem.getImageUrl();
        customizationItemOutputDto.job = customizationItem.getJob();
        customizationItemOutputDto.unlocked = customizationItem.getUnlocked();
        customizationItemOutputDto.price = customizationItem.getPrice();

        return customizationItemOutputDto;
    }
}
