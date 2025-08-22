package com.aurora_lyhnn.rpg_life.service;

import com.aurora_lyhnn.rpg_life.dto.CustomizationItemInputDto;
import com.aurora_lyhnn.rpg_life.dto.CustomizationItemOutputDto;
import com.aurora_lyhnn.rpg_life.mapper.CustomizationItemMapper;
import com.aurora_lyhnn.rpg_life.model.CustomizationItem;
import com.aurora_lyhnn.rpg_life.repository.CustomizationItemRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class CustomizationItemService {

    private final CustomizationItemRepository customizationItemRepository;

    public CustomizationItemService(CustomizationItemRepository customizationItemRepository) {
        this.customizationItemRepository = customizationItemRepository;
    }

    public CustomizationItemOutputDto createCustomizationItem(CustomizationItemInputDto customizationItemInputDto) {
        CustomizationItem customizationItem = CustomizationItemMapper.toEntity(customizationItemInputDto);
        this.customizationItemRepository.save(customizationItem);

        return CustomizationItemMapper.toDto(customizationItem);
    }

    public CustomizationItemOutputDto getCustomizationItemById(@PathVariable long id) {

        CustomizationItem customizationItem = this.customizationItemRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Customization item not found"));

        return CustomizationItemMapper.toDto(customizationItem);
    }
}
