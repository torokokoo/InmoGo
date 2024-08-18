package com.inmogo.api.Entity;

import java.util.ArrayList;

public class UserAdmin extends UserTemplate {
    //Constructor
    public UserAdmin(long id, String name, String rut, String email, String password, String role, String permission, ArrayList<ChatHistory> chatHistorys) {
        super(id, name, rut, email, password, role, permission, chatHistorys);
    }

    public UserAdmin(){
        super();
    }

    //Metodos agregados de Admin
    public Listing Publicar(){ //Publicar
        //TODO
        return new Listing();
    }

    public void contactSeller(){ //ContactarVendedor
        //TODO
    }

    public Listing manageListing(){ //GestionarPublicaciones
        //TODO
        return new Listing();
    }

    public void manageFormsAndRequests(){ //GestionarFormulariosYSolicitudes
        //TODO
    }

    public void modifyForums(){ //ModificarForo
        //TODO
    }

}
