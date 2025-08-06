package com.aurora_lyhnn.rpg_life.controller;

import com.aurora_lyhnn.rpg_life.dto.OutfitInputDto;
import com.aurora_lyhnn.rpg_life.dto.OutfitOutputDto;
import com.aurora_lyhnn.rpg_life.service.OutfitService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/outfits")
public class OutfitController {

    private final OutfitService outfitService;

    public OutfitController(OutfitService outfitService) {
        this.outfitService = outfitService;
    }

    @PostMapping
    public ResponseEntity<OutfitOutputDto> createOutfit(@RequestBody OutfitInputDto outfitInputDto) {
        OutfitOutputDto outfitOutputDto = outfitService.createOutfit(outfitInputDto);

        URI uri = URI.create(ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/" + outfitOutputDto.id).toUriString());

        return ResponseEntity.created(uri).body(outfitOutputDto);
    }

    @GetMapping
    public ResponseEntity<OutfitOutputDto> getOutfitById(@PathVariable long id) {
        return ResponseEntity.ok(outfitService.getOutfitById(id));
    }
}
