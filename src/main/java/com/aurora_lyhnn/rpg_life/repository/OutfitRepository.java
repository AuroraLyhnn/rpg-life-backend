package com.aurora_lyhnn.rpg_life.repository;

import com.aurora_lyhnn.rpg_life.dto.OutfitOutputDto;
import com.aurora_lyhnn.rpg_life.model.Outfit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OutfitRepository extends JpaRepository<Outfit, Long> {

}
