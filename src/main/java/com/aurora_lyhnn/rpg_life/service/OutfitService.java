package com.aurora_lyhnn.rpg_life.service;

import com.aurora_lyhnn.rpg_life.dto.OutfitInputDto;
import com.aurora_lyhnn.rpg_life.dto.OutfitOutputDto;
import com.aurora_lyhnn.rpg_life.mapper.OutfitMapper;
import com.aurora_lyhnn.rpg_life.model.Outfit;
import com.aurora_lyhnn.rpg_life.repository.OutfitRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import java.util.Optional;

@Service
public class OutfitService {
    private final OutfitRepository outfitRepository;

    public OutfitService(OutfitRepository outfitRepository) {
        this.outfitRepository = outfitRepository;
    }

    public OutfitOutputDto createOutfit(OutfitInputDto outfitInputDto) {
        Outfit outfit = OutfitMapper.toEntity(outfitInputDto);
        this.outfitRepository.save(outfit);

        return OutfitMapper.toDto(outfit);
    }

    public OutfitOutputDto getOutfitById(long id) {
        Outfit outfit = this.outfitRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Outfit with id" + id + " not found."));

        return OutfitMapper.toDto(outfit);

    }
}
