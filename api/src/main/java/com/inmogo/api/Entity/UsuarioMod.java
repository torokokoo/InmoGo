package com.inmogo.api.Entity;

public class UsuarioMod extends Usuario {
    //Constructor
    public UsuarioMod(long id, String nombre, String rut, String email, String contrasena, String rol, String permiso) {
        super(id,nombre,rut,email,contrasena,rol,permiso);
    }

    //Metodos Agregados por Mod

    /*
    public Publicacion GestionarPublicaciones(){return Publicacion;}
    public void ActualizarBaseDeDatos(){}
    */
}
