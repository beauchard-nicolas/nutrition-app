package com.example.nutritionapp.service;

import com.example.nutritionapp.model.ShoppingList;
import com.example.nutritionapp.model.User;
import com.example.nutritionapp.repository.ShoppingListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ShoppingListService {

    private final ShoppingListRepository shoppingListRepository;

    @Autowired
    public ShoppingListService(ShoppingListRepository shoppingListRepository) {
        this.shoppingListRepository = shoppingListRepository;
    }

    public List<ShoppingList> getAllShoppingLists() {
        return shoppingListRepository.findAll();
    }

    public Optional<ShoppingList> getShoppingListById(Long id) {
        return shoppingListRepository.findById(id);
    }

    public ShoppingList createShoppingList(ShoppingList shoppingList) {
        return shoppingListRepository.save(shoppingList);
    }

    public ShoppingList updateShoppingList(ShoppingList shoppingList) {
        return shoppingListRepository.save(shoppingList);
    }

    public void deleteShoppingList(Long id) {
        shoppingListRepository.deleteById(id);
    }

    public List<ShoppingList> findByUser(User user) {
        return shoppingListRepository.findByUser(user);
    }
}