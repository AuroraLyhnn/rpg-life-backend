package com.aurora_lyhnn.rpg_life.dto;

import com.aurora_lyhnn.rpg_life.enums.ItemPart;
import com.aurora_lyhnn.rpg_life.enums.ItemType;
import com.aurora_lyhnn.rpg_life.enums.Job;

public class CustomizationItemOutputDto {
    public long id;
    public ItemType itemType;
    public String name;
    public ItemPart itemPart;
    public String imageUrl;
    public Job job;
    public boolean unlocked;
    public int price;
}
