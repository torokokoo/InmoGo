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


    /*prendiente desarrollar funcionalidades

    - Publicar(): return Publicación
    - EditarPublicaciones(): return Publicación
    - PromocionSemanal(): return void
    - PagarBeneficios(): return void
    */
    public Listing publish() {
        // Implementar logica
        return new Listing();
    }

    // Edit publications method
    public Listing editPublications() {
        // Implementar logica
        return new Listing();
    }

    // Weekly promotion method (void return type)
    public void weeklyPromotion() {
        // Implementar logica
    }

    // Pay benefits method (void return type)

    public void payBenefits() {
        // Implementar logica
    }



}

