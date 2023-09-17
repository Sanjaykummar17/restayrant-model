package com.example.restaurantmanagement.repository;

import com.example.restaurantmanagement.model.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
}
