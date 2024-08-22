package com.inmogo.api.Entity;
import jakarta.persistence.Entity;
import jakarta.persistence.*;

//Clase de los Propietarios de inmuebles heradado de user

@Entity
@DiscriminatorValue("Owner")
public class Owner extends UserTemplate {


    public Owner(long id, String name, String rut, String email, String password, Integer role) {
        super(id, name, rut, email, password, role);
    }

    public Owner() {

    }


}

