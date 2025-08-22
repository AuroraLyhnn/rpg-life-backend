package com.aurora_lyhnn.rpg_life.repository;

import com.aurora_lyhnn.rpg_life.enums.QuestType;
import com.aurora_lyhnn.rpg_life.model.Quest;
import com.aurora_lyhnn.rpg_life.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestRepository extends JpaRepository<Quest, Long> {

    List<Quest> findByQuestUserAndQuestType(User questUser, QuestType type);
    List<Quest> findByQuestUserAndQuestTypeAndPriorityOrderByCompletedAsc(User questUser, QuestType type, boolean priority, boolean completed);
    List<Quest> findByQuestUserAndQuestTypeAndPriorityFalseOrderByCompletedAsc(User questUser, QuestType type, boolean priority, boolean completed);
    List<Quest> findByQuestUserAndQuestTypeOrderByCompletedAsc(User questUser, QuestType type, boolean completed);
}
