package com.inmogo.api.Entity;
import jakarta.persistence.*;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    //atributos
    private long id;
    private String name;
    private String rut;
    private String email;
    private String password;
    private String role;
    private String permission;
    //private String ArrayList<HistorialChat>;

    //constructor User
    public User(String name, String rut, String email, String password, String role, String permission) {
        this.id = id;
        this.name = name;
        this.rut = rut;
        this.email = email;
        this.password = password;
        this.role = role;
        this.permission = permission;
    }

    public User(){

    }

    //getters y setters User

    public String getName() {
        return name;
    }

    public void setName(String nombre) {
        this.name = nombre;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String rol) {
        this.role = rol;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permiso) {
        this.permission = permiso;
    }
}
