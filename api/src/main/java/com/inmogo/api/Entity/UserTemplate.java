package com.inmogo.api.Entity;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Representa al "esqueleto" de lo que se compone un usuario.
 * Correspondera a la estructura general de todas las personas que interactuan con el sistema.
 * Los roles como Admin, Mod, Propietario, y Arrendatario estaran en clases separadas.
 */

@Entity
@Table(name = "UserTemplate")
public class UserTemplate {
    //Attributes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String rut;
    private String email;
    private String password;
    private String role;
    private String permission;

    @OneToMany
    private ArrayList<ChatHistory> chatHistory = new ArrayList<ChatHistory>();;

    //Constructor
    public UserTemplate(Long id, String name, String rut, String email, String password, String role, String permission) {
        this.id = id;
        this.name = name;
        this.rut = rut;
        this.email = email;
        this.password = password;
        this.role = role;
        this.permission = permission;
    }

    //Constructor Default
    public UserTemplate() {
    }

    //Getters
    public long getId() { return id; }
    public String getName() { return name; }
    public String getRut() { return rut; }
    public String getEmail() { return email; }
    public String getPassword() { return password; }
    public String getRole() { return role; } //ConseguirRol
    public String getPermission() { return permission; } //ConseguirPermiso
    public ArrayList<ChatHistory> getChatHistory() { return chatHistory; }

    //Setters
    public void setId(long id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setRut(String rut) { this.rut = rut; }
    public void setEmail(String email) { this.email = email; }
    public void setPassword(String password) { this.password = password; }
    public void setRole(String role) { this.role = role; }
    public void setPermission(String permission) { this.permission = permission; }
    public void setChatHistory(ArrayList<ChatHistory> chatHistory) { this.chatHistory = chatHistory; }
}
