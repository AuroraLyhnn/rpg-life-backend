package com.aurora_lyhnn.rpg_life.model;

import com.aurora_lyhnn.rpg_life.enums.EyeColor;
import com.aurora_lyhnn.rpg_life.enums.Job;
import com.aurora_lyhnn.rpg_life.enums.Race;
import com.aurora_lyhnn.rpg_life.enums.SkinTone;
import jakarta.persistence.*;

@Entity
@Table(name = "characters")
public class Character {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    @Enumerated(EnumType.STRING)
    private Race race;
    @Enumerated(EnumType.STRING)
    private SkinTone skin_tone;
    @Enumerated(EnumType.STRING)
    private EyeColor eye_color;
    @Enumerated(EnumType.STRING)
    private Job job;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "outfit_id")
    Outfit outfit;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public SkinTone getSkin_tone() {
        return skin_tone;
    }

    public void setSkin_tone(SkinTone skin_tone) {
        this.skin_tone = skin_tone;
    }

    public EyeColor getEye_color() {
        return eye_color;
    }

    public void setEye_color(EyeColor eye_color) {
        this.eye_color = eye_color;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public Outfit getOutfit() {
        return outfit;
    }
}
