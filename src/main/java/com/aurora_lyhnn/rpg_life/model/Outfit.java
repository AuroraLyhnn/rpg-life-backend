package com.aurora_lyhnn.rpg_life.model;

import jakarta.persistence.*;

@Entity
@Table(name = "outfits")
public class Outfit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String hair;
    private String weapon;
    private String clothing;
    private String shoes;
    @Column(name = "head_accessory")
    private String headAccessory;
    private String wings;

    @OneToOne(mappedBy = "outfit")
    Hero hero;

    public long getId() {
        return id;
    }

    public String getHair() {
        return hair;
    }

    public void setHair(String hair) {
        this.hair = hair;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getClothing() {
        return clothing;
    }

    public void setClothing(String clothing) {
        this.clothing = clothing;
    }

    public String getShoes() {
        return shoes;
    }

    public void setShoes(String shoes) {
        this.shoes = shoes;
    }

    public String getHeadAccessory() {
        return headAccessory;
    }

    public void setHeadAccessory(String headAccessory) {
        this.headAccessory = headAccessory;
    }

    public String getWings() {
        return wings;
    }

    public void setWings(String wings) {
        this.wings = wings;
    }

    public Hero getHero() {
        return hero;
    }
}
