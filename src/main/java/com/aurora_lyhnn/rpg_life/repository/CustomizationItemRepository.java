package com.aurora_lyhnn.rpg_life.repository;

import com.aurora_lyhnn.rpg_life.enums.ItemPart;
import com.aurora_lyhnn.rpg_life.enums.ItemType;
import com.aurora_lyhnn.rpg_life.enums.Job;
import com.aurora_lyhnn.rpg_life.model.CustomizationItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomizationItemRepository extends JpaRepository<CustomizationItem, Long> {
    List<CustomizationItem> findByJobAndItemTypeAndItemPartAndUnlocked(Job job, ItemType itemType, ItemPart itemPart, boolean unlocked);
    List<CustomizationItem> findByNameAndItemTypeAndItemPartAndJob(String name, ItemType itemType, ItemPart itemPart, Job job);
}
