package com.inmogo.api.Entity;

import jakarta.persistence.*;


@Entity
@Table(name="Appointment")
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    //Estos dos valores son coordenadas de la matriz de Agendas.
    private long unixDate;

    //Constructor
    public Appointment(long ownerId, long acquirerId, long listingId, long unixDate) {
        this.ownerId = ownerId;
        this.acquirerId = acquirerId;
        this.listingId = listingId;
        this.unixDate = unixDate;
    }

    public Appointment(){}

    //Getter
    public long getId() {return id;}
    public long getOwnerId() {return ownerId;}
    public long getAcquirerId() {return acquirerId;}
    public long getListingId() {return listingId;}
    public long getUnixDate() { return unixDate; }

    //Setter
    public void setId(long id) {this.id = id;}
    public void setOwnerId(long ownerId) {this.ownerId = ownerId;}
    public void setAcquirerId(long acquirerId) {this.acquirerId = acquirerId;}
    public void setListingId(long listingId) {this.listingId = listingId;}
    public void setUnixDate(long unixDate) { this.unixDate = unixDate; }
}
