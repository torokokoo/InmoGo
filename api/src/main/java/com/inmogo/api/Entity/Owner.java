package com.inmogo.api.Entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.*;
import java.util.*;

//Clase de los Propietarios de inmuebles heradado de user

@Entity
@DiscriminatorValue("Owner")
public class Owner extends UserTemplate {


    public Owner(long id, String name, String rut, String email, String password, String role, String permission) {
        super(id, name, rut, email, password, role, permission);
    }

    public Owner() {

    }


}

