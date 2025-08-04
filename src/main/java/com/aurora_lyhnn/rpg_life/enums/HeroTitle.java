package com.aurora_lyhnn.rpg_life.enums;

public enum HeroTitle {
    SPARK_OF_HOPE("Spark of Hope"),
    LEAFBORNE_WANDERER("Leafborne Wanderer"),
    EMBERFOOT("Emberfoot"),
    MOONLIT_SHADOW("Moonlit Shadow"),
    HERO_OF_FIRE("Hero of Fire"),
    STARBORN_KNIGHT("Starborn Knight"),
    PHOENIXHEART("Phoenixheart");

    private final String displayName;

    HeroTitle(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}