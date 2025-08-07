package com.aurora_lyhnn.rpg_life.repository;

import com.aurora_lyhnn.rpg_life.model.Hero;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HeroRepository extends JpaRepository<Hero, Long> {
}
