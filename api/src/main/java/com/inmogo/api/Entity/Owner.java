package com.inmogo.api.Entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.*;
import java.util.*;

//Clase de los Propietarios de inmuebles heradado de user

@Entity
@Table(name = "owner")
public class Owner extends UserTemplate {
    private List<Listing> listings = new ArrayList<>();
    
     public Listing publish(String title, String notesFromPropietary, int rankingPos) {
        Listing newListing = new Listing(title, new Timestamp(System.currentTimeMillis()), notesFromPropietary, rankingPos);
        listings.add(newListing);
        
        return newListing;
    }

    public Listing editPublications(Listing listing, String newTitle, String newNotes, int newRankingPos){
        listing.setTitle(newTitle);
        listing.publishDate(new Timestamp(System.currentTimeMillis()));
        listing.setNotesFromPropietary(newNotes);
        listing.setRankingPos(newRankingPos);
        
        return listing;
    }	

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

