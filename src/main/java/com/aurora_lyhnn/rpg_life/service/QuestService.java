package com.aurora_lyhnn.rpg_life.service;

import com.aurora_lyhnn.rpg_life.dto.QuestInputDto;
import com.aurora_lyhnn.rpg_life.dto.QuestOutputDto;
import com.aurora_lyhnn.rpg_life.mapper.QuestMapper;
import com.aurora_lyhnn.rpg_life.model.Quest;
import com.aurora_lyhnn.rpg_life.repository.QuestRepository;
import org.springframework.stereotype.Service;

@Service
public class QuestService {
    private final QuestRepository questRepository;
    private final UserRepository userRepository;

    public QuestService(QuestRepository questRepository) {
        this.questRepository = questRepository;
    }

    public QuestOutputDto createQuest(QuestInputDto questInputDto) {
        Quest quest = QuestMapper.toEntity(questInputDto);
        this.questRepository.save(quest);

        return QuestMapper.toDto(quest);
    }

    public QuestOutputDto getQuestById(long id) {
        Quest quest = this.questRepository.findById(id)
                .orElse(null);

        return QuestMapper.toDto(quest);
    }

    public QuestOutputDto updateQuest(QuestInputDto questInputDto) {
        Quest quest = QuestMapper.toEntity(questInputDto);
        this.questRepository.save(quest);
    }

    public QuestOutputDto deleteQuest(long id) {

    }

    public List<QuestOutputDto> priorityQuests() {}
}
