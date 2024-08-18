package com.inmogo.api.Entity;

import jakarta.persistence.*;
@Entity
@Table(name = "userMod")

public class UserMod extends UserTemplate {
    //Constructor
    public UserMod(long id, String name, String rut, String email, String password, String role, String permission) {
        super(id, name, rut, email, password, role, permission);
    }

    public UserMod(){
        super();
    }

    //Metodos Agregados por Mod

    public Listing manageListing(){ //GestionarPublicaciones
        //TODO
        return new Listing();
    }

    public void updateDatabase(){ //ActualizarBaseDeDatos
        //TODO
    }
}
