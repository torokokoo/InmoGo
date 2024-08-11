package com.inmogo.api.Entity;

public class UsuarioAdmin extends Usuario {
    //Constructor
    public UsuarioAdmin(long id, String nombre, String rut, String email, String contrasena, String rol, String permiso) {
        super(id,nombre,rut,email,contrasena,rol,permiso);
    }

    //Metodos agregados de Admin

    /*
    public Publicacion Publicar(){return Publicacion;};
    public void ContactarVendedor(){};
    public Publicacion GestionarPublicaciones(){return Publicacion;}
    public void GestionarFormulariosYSolicitudes(){}
    public void ModificarForo(){}
    */
}
