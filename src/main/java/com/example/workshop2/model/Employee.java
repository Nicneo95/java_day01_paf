package com.example.workshop2.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// 1. Create model class for the table attribute then proceed to implement Employee Service 
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    
    private int id;

    private String name;

    private String email;

    private String department; 

}
