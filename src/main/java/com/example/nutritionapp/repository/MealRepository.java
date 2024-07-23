package com.example.nutritionapp.repository;

import com.example.nutritionapp.model.Meal;
import com.example.nutritionapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MealRepository extends JpaRepository<Meal, Long> {
    List<Meal> findByUser(User user);
}