package com.inmogo.api.Service;

import com.inmogo.api.Entity.Listing;
import com.inmogo.api.Repository.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Date;
import java.sql.Timestamp;


@Service
public class OwnerService {

    /*prendiente desarrollar funcionalidades

    - Publicar(): return Publicación
    - EditarPublicaciones(): return Publicación
    - PromocionSemanal(): return void
    - PagarBeneficios(): return void

        private String title;
    private Timestamp publishDate;
    private String notesFromPropietary;
    */

    @Autowired
    private OwnerRepository OwnerRepo;



/*
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

 */
}
