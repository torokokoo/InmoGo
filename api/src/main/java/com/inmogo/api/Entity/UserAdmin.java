package com.inmogo.api.Entity;
import jakarta.persistence.Entity;
import jakarta.persistence.*;

@Entity
@DiscriminatorValue("Admin")

public class UserAdmin extends UserTemplate {
    //Constructor
    public UserAdmin(long id, String name, String rut, String email, String password) {
        super(id, name, rut, email, password, 1);
    }

    public UserAdmin(){
        super();
        this.setRole(1); // Establece el rol a 1 (Administrador)
    }

}
