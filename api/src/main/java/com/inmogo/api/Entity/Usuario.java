package com.inmogo.api.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Usuario")

public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //atributos
    private long Id;
    private String Nombre;
    private String Rut;
    private String Email;
    private String Contrasena;
    private String Rol;
    private String Permiso;
    //private String ArrayList<HistorialChat>;

    //constructor Usuario
    public Usuario(long id, String nombre, String rut, String email, String contrasena, String rol, String permiso) {
        Id = id;
        Nombre = nombre;
        Rut = rut;
        Email = email;
        Contrasena = contrasena;
        Rol = rol;
        Permiso = permiso;
    }

    //getters y setters Usuario

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getRut() {
        return Rut;
    }

    public void setRut(String rut) {
        Rut = rut;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getContrasena() {
        return Contrasena;
    }

    public void setContrasena(String contrasena) {
        Contrasena = contrasena;
    }

    public String getRol() {
        return Rol;
    }

    public void setRol(String rol) {
        Rol = rol;
    }

    public String getPermiso() {
        return Permiso;
    }

    public void setPermiso(String permiso) {
        Permiso = permiso;
    }
}
