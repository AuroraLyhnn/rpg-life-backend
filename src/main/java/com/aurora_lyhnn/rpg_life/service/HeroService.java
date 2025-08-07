package com.aurora_lyhnn.rpg_life.service;

import com.aurora_lyhnn.rpg_life.dto.HeroInputDto;
import com.aurora_lyhnn.rpg_life.dto.HeroOutputDto;
import com.aurora_lyhnn.rpg_life.mapper.HeroMapper;
import com.aurora_lyhnn.rpg_life.model.Hero;
import com.aurora_lyhnn.rpg_life.repository.HeroRepository;
import org.springframework.stereotype.Service;

@Service
public class HeroService {

    private final HeroRepository heroRepository;

    public HeroService(HeroRepository heroRepository) {
        this.heroRepository = heroRepository;
    }

    public HeroOutputDto createHero(HeroInputDto heroInputDto) {
        Hero hero = HeroMapper.toEntity(heroInputDto);
        this.heroRepository.save(hero);

        return HeroMapper.toDto(hero);
    }

    public HeroOutputDto getHeroById(long id) {

        Hero hero = this.heroRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Hero " + id + " not found!"));

        return HeroMapper.toDto(hero);
    }

}
