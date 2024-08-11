package com.inmogo.api.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    //atributos
    private long id;
    private String nombre;
    private String rut;
    private String email;
    private String password;
    private String rol;
    private String permiso;
    //private String ArrayList<HistorialChat>;

    //constructor Usuario
    public Usuario(String nombre, String rut, String email, String password, String rol, String permiso) {
        this.id = id;
        this.nombre = nombre;
        this.rut = rut;
        this.email = email;
        this.password = password;
        this.rol = rol;
        this.permiso = permiso;
    }

    public Usuario(){

    }

    //getters y setters Usuario

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getPermiso() {
        return permiso;
    }

    public void setPermiso(String permiso) {
        this.permiso = permiso;
    }
}
