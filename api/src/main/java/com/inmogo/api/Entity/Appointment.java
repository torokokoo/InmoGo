package com.inmogo.api.Entity;

import jakarta.persistence.*;
import org.apache.catalina.User;

@Entity
@Table(name="Appointment")
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "owner_id", nullable = false)
    private UserTemplate ownerId;

    @ManyToOne
    @JoinColumn(name = "acquirer_id", nullable = false)
    private UserTemplate acquirerId;

    @ManyToOne
    @JoinColumn(name = "listing_id", nullable = false)
    private Listing listingId;

    private long unixDate;

    // Constructores
    public Appointment(UserTemplate ownerId, UserTemplate acquirerId, Listing listingId, long unixDate) {
        this.ownerId = ownerId;
        this.acquirerId = acquirerId;
        this.listingId = listingId;
        this.unixDate = unixDate;
    }

    public Appointment() {}

    // Getters y Setters

    //Getter
    public long getId() {return id;}
    public UserTemplate getOwnerId() {return ownerId;}
    public UserTemplate getAcquirerId() {return acquirerId;}
    public Listing getListingId() {return listingId;}
    public long getUnixDate() { return unixDate; }

    //Setter
    public void setId(long id) {this.id = id;}
    public void setOwnerId(UserTemplate ownerId) {this.ownerId = ownerId;}
    public void setAcquirerId(UserTemplate acquirerId) {this.acquirerId = acquirerId;}
    public void setListingId(Listing listingId) {this.listingId = listingId;}
    public void setUnixDate(Long unixDate) { this.unixDate = unixDate; }
}
