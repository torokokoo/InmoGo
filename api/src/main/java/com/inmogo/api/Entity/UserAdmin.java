package com.inmogo.api.Entity;

public class UserAdmin extends UserTemplate {
    //Constructor
    public UserAdmin(long id, String name, String rut, String email, String password, String role, String permission) {
        super(id, name, rut, email, password, role, permission);
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
