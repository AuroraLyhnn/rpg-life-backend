package com.aurora_lyhnn.rpg_life.controller;

import com.aurora_lyhnn.rpg_life.dto.CustomizationItemInputDto;
import com.aurora_lyhnn.rpg_life.dto.CustomizationItemOutputDto;
import com.aurora_lyhnn.rpg_life.service.CustomizationItemService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/customization_item")
public class CustomizationItemController {

    private final CustomizationItemService customizationItemService;

    public CustomizationItemController(CustomizationItemService customizationItemService) {
        this.customizationItemService = customizationItemService;
    }

    @PostMapping
    public ResponseEntity<CustomizationItemOutputDto> createCustomizationItem(@Valid @RequestBody CustomizationItemInputDto customizationItemInputDto) {
        CustomizationItemOutputDto customizationItemOutputDto = this.customizationItemService.createCustomizationItem(customizationItemInputDto);

        URI uri = URI.create(ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/" + customizationItemOutputDto.id).toUriString());

        return ResponseEntity.created(uri).body(customizationItemOutputDto);
    }

    @GetMapping
    public ResponseEntity<CustomizationItemOutputDto> getCustomizationItemById(@PathVariable long id) {
        return ResponseEntity.ok(customizationItemService.getCustomizationItemById(id));
    }
}
