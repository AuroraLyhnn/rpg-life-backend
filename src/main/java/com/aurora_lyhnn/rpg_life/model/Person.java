package com.aurora_lyhnn.rpg_life.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "persons")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(length = 127, nullable = false, unique = true)
    private String email;
    private String password;
    private LocalDate date_joined;
    private Enum person_type;

}