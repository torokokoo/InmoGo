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

