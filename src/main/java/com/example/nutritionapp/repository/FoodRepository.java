package com.example.nutritionapp.repository;

import com.example.nutritionapp.model.Food;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodRepository extends JpaRepository<Food, Long> {

    Food findByName(String name);
}