package com.aurora_lyhnn.rpg_life.model;

import com.aurora_lyhnn.rpg_life.enums.*;
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
    @Column(name = "skint_tone")
    private SkinTone skinTone;
    @Enumerated(EnumType.STRING)
    @Column(name = "eye_color")
    private EyeColor eyeColor;
    @Enumerated(EnumType.STRING)
    private Job job;
    private int experience;
    @Column(name = "hero_title")
    private HeroTitle heroTitle;

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

    public SkinTone getSkinTone() {
        return skinTone;
    }

    public void setSkinTone(SkinTone skinTone) {
        this.skinTone = skinTone;
    }

    public EyeColor getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(EyeColor eyeColor) {
        this.eyeColor = eyeColor;
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
