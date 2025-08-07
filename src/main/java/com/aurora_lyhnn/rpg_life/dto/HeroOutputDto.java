package com.aurora_lyhnn.rpg_life.dto;

import com.aurora_lyhnn.rpg_life.enums.*;
import com.aurora_lyhnn.rpg_life.model.Outfit;

public class HeroOutputDto {
        public long id;
        public String name;
        public Race race;
        public SkinTone skinTone;
        public EyeColor eyeColor;
        public Job job;
        public int experience;
        public HeroTitle heroTitle;
        public Outfit outfit;
    }
