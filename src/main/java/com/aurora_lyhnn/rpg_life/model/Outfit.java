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
    private String head_accessory;
    private String wings;

    @OneToOne(mappedBy = "outfit")
    Character character;

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

    public String getHead_accessory() {
        return head_accessory;
    }

    public void setHead_accessory(String head_accessory) {
        this.head_accessory = head_accessory;
    }

    public String getWings() {
        return wings;
    }

    public void setWings(String wings) {
        this.wings = wings;
    }

    public Character getCharacter() {
        return character;
    }
}
