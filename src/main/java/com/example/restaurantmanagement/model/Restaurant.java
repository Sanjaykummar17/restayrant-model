package com.example.restaurantmanagement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


//import javax.persistence.*;

@Entity
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String address;
    private String specialty;
    private int totalStaffs;

    public Object getSpecialty() {
        return null;
    }


    public void getClass(Object specialty) {
    }

    // Add any other relevant variables here

    // Constructors, getters, and setters
}
