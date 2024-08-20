package com.inmogo.api.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.*;

/**
 * Usuarios Propietarios.
 */

@Entity
@DiscriminatorValue("UserOwner")
public class UserOwner extends UserTemplate {
    //Construct
    public UserOwner(long id, String name, String rut, String email, String password, String role, String permission) {
        super(id, name, rut, email, password, role, permission);
    }

    public UserOwner() {
        super();
    }
}

