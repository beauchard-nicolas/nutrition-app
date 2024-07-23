package com.example.nutritionapp.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String email;

    private String firstName;
    private String lastName;

    @Column(nullable = false)
    private LocalDate dateOfBirth;

    private Double height; // en cm
    private Double weight; // en kg

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Column(nullable = false)
    private Double dailyCalorieGoal;

    public enum Gender {
        MALE, FEMALE, OTHER
    }
}
