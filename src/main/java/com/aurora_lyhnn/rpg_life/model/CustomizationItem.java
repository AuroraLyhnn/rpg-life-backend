package com.aurora_lyhnn.rpg_life.model;

import com.aurora_lyhnn.rpg_life.enums.ItemPart;
import com.aurora_lyhnn.rpg_life.enums.ItemType;
import com.aurora_lyhnn.rpg_life.enums.Job;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "customisation_items")
public class CustomizationItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Enumerated(EnumType.STRING)
    @Column(name = "item_type")
    private ItemType itemType;
    private String name;
    @Enumerated(EnumType.STRING)
    @Column(name = "item_part")
    private ItemPart itemPart;
    @Column(name = "image_url")
    private String imageUrl;
    @Enumerated(EnumType.STRING)
    private Job job;
    private boolean unlocked;
    private int price;

    @ManyToMany(mappedBy = "customisation_items")
    private Set<User> users = new HashSet<>();

    public long getId() {
        return id;
    }

    public ItemType getItemType() {
        return itemType;
    }

    public void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }

    public String getName() {
        return name;
    }

    public ItemPart getItemPart() {
        return itemPart;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public boolean getUnlocked() {
        return unlocked;
    }

    public void setUnlocked(boolean unlocked) {
        this.unlocked = unlocked;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    public void setItemPart(ItemPart itemPart) {
        this.itemPart = itemPart;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setName(String name) {
        this.name = name;
    }
}
