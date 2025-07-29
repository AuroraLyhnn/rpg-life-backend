package com.aurora_lyhnn.rpg_life.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "users")
public class User extends Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int exp;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "unlocked_items",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "customisation_item_id")
    )
    private Set<User> users = new HashSet<>();
}





