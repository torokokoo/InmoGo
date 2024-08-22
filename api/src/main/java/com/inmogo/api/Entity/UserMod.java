package com.inmogo.api.Entity;
import jakarta.persistence.Entity;
import jakarta.persistence.*;

@Entity
@DiscriminatorValue("Mod")

public class UserMod extends UserTemplate {
    //Constructor
    public UserMod(long id, String name, String rut, String email, String password, Integer role) {
        super(id, name, rut, email, password, role);
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
