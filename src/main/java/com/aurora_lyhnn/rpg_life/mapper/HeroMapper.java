package com.aurora_lyhnn.rpg_life.mapper;

import com.aurora_lyhnn.rpg_life.dto.HeroInputDto;
import com.aurora_lyhnn.rpg_life.dto.HeroOutputDto;
import com.aurora_lyhnn.rpg_life.model.Hero;

public class HeroMapper {

    public static Hero toEntity(HeroInputDto heroInputDto) {
        Hero hero = new Hero();
        hero.setName(heroInputDto.name);
        hero.setRace(heroInputDto.race);
        hero.setSkinTone(heroInputDto.skinTone);
        hero.setEyeColor(heroInputDto.eyeColor);
        hero.setJob(heroInputDto.job);
        hero.setExperience(heroInputDto.experience);
        hero.setHeroTitle(heroInputDto.heroTitle);

        return hero;
    }

    public static HeroOutputDto toDto(Hero hero) {
        HeroOutputDto heroOutputDto = new HeroOutputDto();
        heroOutputDto.name = hero.getName();
        heroOutputDto.race = hero.getRace();
        heroOutputDto.skinTone = hero.getSkinTone();
        heroOutputDto.eyeColor = hero.getEyeColor();
        heroOutputDto.job = hero.getJob();
        heroOutputDto.experience = hero.getExperience();
        heroOutputDto.heroTitle = hero.getHeroTitle();

        return heroOutputDto;
    }
}
