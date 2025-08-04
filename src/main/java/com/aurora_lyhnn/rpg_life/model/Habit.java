package com.aurora_lyhnn.rpg_life.model;

import com.aurora_lyhnn.rpg_life.enums.ResetInterval;
import jakarta.persistence.*;

@Entity
@Table(name = "habits")
public class Habit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Enumerated(EnumType.STRING)
    private ResetInterval resetInterval;
    private String description;
    private boolean completed;

    public long getId() {
        return id;
    }

    public ResetInterval getResetInterval() {
        return resetInterval;
    }

    public void setResetInterval(ResetInterval resetInterval) {
        this.resetInterval = resetInterval;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
