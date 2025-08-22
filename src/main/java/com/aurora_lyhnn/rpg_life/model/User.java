package com.aurora_lyhnn.rpg_life.model;

import com.aurora_lyhnn.rpg_life.enums.Role;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(length = 127, nullable = false, unique = true)
    private String email;
    private String password;
    @Column(name = "date_joined")
    private LocalDate dateJoined;
    @Enumerated(EnumType.STRING)
    @Column(name = "role")
    private Role role;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "unlocked_items",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "customisation_item_id")
    )
    private Set<CustomizationItem> customizationItems = new HashSet<>();

    public long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public LocalDate getDateJoined() {
        return dateJoined;
    }

    public Role getRoleType() {
        return role;
    }

    public Set<CustomizationItem> getCustomizationItems() {
        return customizationItems;
    }

    public void setCustomizationItems(Set<CustomizationItem> customizationItems) {
        this.customizationItems = customizationItems;
    }
}





