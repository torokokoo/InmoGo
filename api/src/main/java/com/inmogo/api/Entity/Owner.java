package com.inmogo.api.Entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.*;
import java.util.*;

//Clase de los Propietarios de inmuebles heradado de user
@Entity
@Table(name = "owner")
public class Owner extends UserTemplate {

    /*prendiente desarrollar funcionalidades

    - Publicar(): return Publicación
    - EditarPublicaciones(): return Publicación
    - PromocionSemanal(): return void
    - PagarBeneficios(): return void

        public Listing publish() {
            // Implementar logica
            return new Publication();
        }

        // Edit publications method
        public Listing editPublications() {
            // Implementar logica
            return new Publication();
        }

        // Weekly promotion method (void return type)
        public void weeklyPromotion() {
            // Implementar logica
        }

        // Pay benefits method (void return type)

        public void payBenefits() {
            // Implementar logica
        }
     */


}

