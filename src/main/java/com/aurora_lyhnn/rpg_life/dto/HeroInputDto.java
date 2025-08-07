package com.aurora_lyhnn.rpg_life.dto;

import com.aurora_lyhnn.rpg_life.enums.*;
import com.aurora_lyhnn.rpg_life.model.Outfit;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class HeroInputDto {
     @NotBlank(message = "Name cannot be empty")
     @Size(min=2, max=64)
     public String name;
     public Race race;
     public SkinTone skinTone;
     public EyeColor eyeColor;
     public Job job;
     public int experience;
     public HeroTitle heroTitle;
     public Outfit outfit;
}
