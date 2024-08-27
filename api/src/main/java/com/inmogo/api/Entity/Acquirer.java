package com.inmogo.api.Entity;
import jakarta.persistence.Entity;
import jakarta.persistence.*;
@Entity
@DiscriminatorValue("Acquirer")

//Clase de los Adquirientes de propiedades herado desde UserTemplate
public class Acquirer extends UserTemplate {

    public Acquirer(long id, String name, String rut, String email, String password) {
        super(id, name, rut, email, password, 4);
    }

    public Acquirer() {
        super();
        this.setRole(4); // Establece el rol a 4 (Adquiriente)

    }
}
