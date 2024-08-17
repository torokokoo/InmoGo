package com.inmogo.api.Entity;

public class UserMod extends UserTemplate {
    //Constructor
    public UserMod(long id, String name, String rut, String email, String password, String role, String permission) {
        super(id, name, rut, email, password, role, permission);
    }

    //Metodos Agregados por Mod

    /*
    public Publicacion GestionarPublicaciones(){return Publicacion;}
    public void ActualizarBaseDeDatos(){}
    */
}
