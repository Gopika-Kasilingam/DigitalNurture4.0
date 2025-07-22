package com.example.Code.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {
    @Id
    private Long id;
    private String name;

    // Constructors, Getters, Setters
    public User() {}
    public User(Long id, String name) {
        this.id = id;
        this.name = name;
    }
    public Long getId() { return id; }
    public String getName() { return name; }
    public void setId(Long id) { this.id = id; }
    public void setName(String name) { this.name = name; }
}
