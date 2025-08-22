package com.aurora_lyhnn.rpg_life.mapper;

import com.aurora_lyhnn.rpg_life.model.Quest;
import com.aurora_lyhnn.rpg_life.dto.QuestInputDto;
import com.aurora_lyhnn.rpg_life.dto.QuestOutputDto;

public class QuestMapper {

    public static Quest toEntity(QuestInputDto questInputDto) {
        Quest quest = new Quest();
        quest.setQuestType(questInputDto.questType);
        quest.setPriority(questInputDto.priority);
        quest.setDescription(questInputDto.description);
        quest.setCompleted(questInputDto.completed);

        return quest;
    }
    public static QuestOutputDto toDto(Quest quest) {
        QuestOutputDto questOutputDto = new QuestOutputDto();
        questOutputDto.questType = quest.getQuestType();
        questOutputDto.priority = quest.getPriority();
        questOutputDto.description = quest.getDescription();
        questOutputDto.completed = quest.isCompleted();

        return questOutputDto;
    }
}
