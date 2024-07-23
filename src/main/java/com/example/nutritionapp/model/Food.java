package com.example.nutritionapp.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "foods")
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    private Double calories; // par 100g
    private Double proteins; // en g par 100g
    private Double carbs;    // en g par 100g
    private Double fats;     // en g par 100g
    private Double fiber;    // en g par 100g

    @Enumerated(EnumType.STRING)
    private FoodCategory category;

    public enum FoodCategory {
        FRUIT, VEGETABLE, GRAIN, PROTEIN, DAIRY, SNACK, BEVERAGE, OTHER
    }
}