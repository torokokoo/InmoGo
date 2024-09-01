package com.inmogo.api.Entity;

import jakarta.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name="Appointment")

public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long ownerId;
    private Long acquirerId;
    private Long listingId;
    private Timestamp date;

    //Constructor
    public Appointment(Long ownerId, Long acquirerId, Long listingId, Timestamp date) {
        this.ownerId = ownerId;
        this.acquirerId = acquirerId;
        this.listingId = listingId;
        this.date = date;
    }

    //Constructor por Defecto
    public Appointment(){}

    //Constructor Autoreferencial
    public Appointment(Appointment appointment){
        this.ownerId = appointment.getOwnerId();
        this.acquirerId = appointment.getAcquirerId();
        this.listingId = appointment.getListingId();
        this.date = appointment.getDate();
    }

    //Getter
    public Long getId() {return id;}
    public Long getOwnerId() {return ownerId;}
    public Long getAcquirerId() {return acquirerId;}
    public Long getListingId() {return listingId;}
    public Timestamp getDate() {return date;}

    //Setter
    public void setId(Long id) {this.id = id;}
    public void setOwnerId(Long ownerId) {this.ownerId = ownerId;}
    public void setAcquirerId(Long acquirerId) {this.acquirerId = acquirerId;}
    public void setListingId(Long listingId) {this.listingId = listingId;}
    public void setDate(Timestamp date) {this.date = date;}
}
