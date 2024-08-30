package com.inmogo.api.Entity;
import jakarta.persistence.Entity;
import jakarta.persistence.*;

//Clase de los Propietarios de inmuebles heradado de user

@Entity
@DiscriminatorValue("Owner")
public class Owner extends UserTemplate {


    public Owner(long id, String name, String rut, String email, String password) {
        super(id, name, rut, email, password, 4);
    }

    public Owner() {
        super();
        this.setRole(4); // Establece el rol a 4 (Propietario)

    }


}

