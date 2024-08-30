package com.inmogo.api.Entity;
import jakarta.persistence.Entity;
import jakarta.persistence.*;

//Clase de los Propietarios de inmuebles heradado de user

@Entity
@DiscriminatorValue("Owner")
public class Owner extends UserTemplate {
    

    public Owner(long id, String name, String rut, String email, String password) {
        super(id, name, rut, email, password, 3);
    }

    public Owner() {
        super();
        this.setRole(3); // Establece el rol a 3 (Propietario)

    }


}

