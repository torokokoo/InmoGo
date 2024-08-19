package com.inmogo.api.Entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.*;
import java.util.*;
@Entity
@DiscriminatorValue("UserMod")

import java.util.ArrayList;

public class UserMod extends UserTemplate {
    //Constructor
    public UserMod(long id, String name, String rut, String email, String password, String role, String permission, ArrayList<ChatHistory> chatHistorys) {
        super(id, name, rut, email, password, role, permission, chatHistorys);
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
