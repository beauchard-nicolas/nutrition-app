package com.example.nutritionapp.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@Table(name = "meals")
public class Meal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(nullable = false)
    private LocalDateTime dateTime;

    @ManyToMany
    @JoinTable(
            name = "meal_foods",
            joinColumns = @JoinColumn(name = "meal_id"),
            inverseJoinColumns = @JoinColumn(name = "food_id")
    )
    private List<Food> foods;

    private String description;

    @Enumerated(EnumType.STRING)
    private MealType type;

    public enum MealType {
        BREAKFAST, LUNCH, DINNER, SNACK
    }
}