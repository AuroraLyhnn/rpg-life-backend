package com.aurora_lyhnn.rpg_life.model;

import com.aurora_lyhnn.rpg_life.enums.ItemPart;
import com.aurora_lyhnn.rpg_life.enums.ItemType;
import com.aurora_lyhnn.rpg_life.enums.Job;
import jakarta.persistence.*;

@Entity
@Table(name = "customisation_items")
public class CustomizationItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Enumerated(EnumType.STRING)
    private ItemType item_type;
    private String name;
    @Enumerated(EnumType.STRING)
    private ItemPart item_part;
    private String image_url;
    @Enumerated(EnumType.STRING)
    private Job job;
    private boolean unlocked;
    private int price;

    @ManyToMany(mappedBy = "customisation_items")
    <List<User> users;
}
