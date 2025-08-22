package com.aurora_lyhnn.rpg_life.dto;

import com.aurora_lyhnn.rpg_life.enums.QuestType;

public class QuestOutputDto {
    public long id;
    public QuestType questType;
    public boolean priority;
    public String description;
    public boolean completed;
}
