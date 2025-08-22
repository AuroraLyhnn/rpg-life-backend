package com.aurora_lyhnn.rpg_life.dto;

import com.aurora_lyhnn.rpg_life.enums.ItemPart;
import com.aurora_lyhnn.rpg_life.enums.ItemType;
import com.aurora_lyhnn.rpg_life.enums.Job;
import jakarta.validation.constraints.NotBlank;

public class CustomizationItemInputDto {
    @NotBlank(message = "please select a type")
    public ItemType itemType;
    @NotBlank(message = "please chose a name for the item")
    public String name;
    public ItemPart itemPart;
    public String imageUrl;
    @NotBlank(message = "please select one or more jobs")
    public Job job;
    public boolean unlocked;
    public int price;
}
