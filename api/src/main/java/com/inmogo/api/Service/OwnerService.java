package com.inmogo.api.Service;

import com.inmogo.api.Repository.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Servicio para gestionar las operaciones relacionadas con los propietarios.
 * 
 * Este servicio se encarga de las operaciones de negocio asociadas a los propietarios, como
 * el manejo de sus publicaciones, la edición de publicaciones existentes, la promoción semanal
 * y el pago de beneficios. Utiliza el repositorio {@link OwnerRepository} para interactuar con la
 * base de datos y realizar las operaciones necesarias sobre los datos de los propietarios.
 * 
 * @see OwnerRepository
 */

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
