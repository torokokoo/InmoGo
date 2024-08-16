package com.inmogo.api.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "User")

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //Attributes
    private long id;
    private String name;
    private String rut;
    private String email;
    private String password;
    private String role;
    private String permission;
    //private String ArrayList<ChatHistory>;

    //Constructor
    public User(long id, String name, String rut, String email, String password, String role, String permission) {
        this.id = id;
        this.name = name;
        this.rut = rut;
        this.email = email;
        this.password = password;
        this.role = role;
        this.permission = permission;
    }

    //Default
    public User() {
        this.id = 0;
        this.name = "Default";
        this.rut = "123456789";
        this.email = "example@example.com";
        this.password = "1234";
        this.role = "User";
        this.permission = "User";
    }

    //Getters
    public long getId() { return id; }
    public String getName() { return name; }
    public String getRut() { return rut; }
    public String getEmail() { return email; }
    public String getPassword() { return password; }
    public String getRole() { return role; }
    public String getPermission() { return permission; }

    //Setters
    public void setId(long id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setRut(String rut) { this.rut = rut; }
    public void setEmail(String email) { this.email = email; }
    public void setPassword(String password) { this.password = password; }
    public void setRole(String role) { this.role = role; }
    public void setPermission(String permission) { this.permission = permission; }
}