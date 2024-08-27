package com.inmogo.api.Entity;
import jakarta.persistence.Entity;
import jakarta.persistence.*;

//Clase de los Propietarios de inmuebles heradado de user

@Entity
@DiscriminatorValue("Owner")
public class Owner extends UserTemplate {
    private List<Listing> listings = new ArrayList<>();
    
     public Listing publish(String title, String notesFromPropietary, int rankingPos) {
        Listing newListing = new Listing(title, new Timestamp(System.currentTimeMillis()), notesFromPropietary, rankingPos);
        listings.add(newListing);
        
        return newListing;
    }

    public Listing editPublish(Listing listing, String newTitle, String newNotes, int newRankingPos){
        listing.setTitle(newTitle);
        listing.publishDate(new Timestamp(System.currentTimeMillis()));
        listing.setNotesFromPropietary(newNotes);
        listing.setRankingPos(newRankingPos);
        
        return listing;
    }	

    public Owner(long id, String name, String rut, String email, String password) {
        super(id, name, rut, email, password, 3);
    }

    public Owner() {
        super();
        this.setRole(3); // Establece el rol a 3 (Propietario)

    }


}

