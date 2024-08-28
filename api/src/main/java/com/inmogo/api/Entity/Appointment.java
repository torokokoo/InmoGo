package com.inmogo.api.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="Appointment")

public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long ownerId;
    private long acquirerId;
    private long listingId;

    //Estos dos valores son coordenadas de la matriz de Agendas.
    private int dayOfAppointment; // puede ser valor entre 1 y 7
    private int timeOfAppointment; // puede ser valor entre 1 y 12

    //Constructor
    public Appointment(long ownerId, long acquirerId, long listingId, int dayOfAppointment, int timeOfAppointment) {
        this.ownerId = ownerId;
        this.acquirerId = acquirerId;
        this.listingId = listingId;
        this.dayOfAppointment = dayOfAppointment;
        this.timeOfAppointment = timeOfAppointment;
    }

    public Appointment(){}

    //Getter
    public long getId() {return id;}
    public long getOwnerId() {return ownerId;}
    public long getAcquirerId() {return acquirerId;}
    public long getListingId() {return listingId;}
    public int getDayOfAppointment() {return dayOfAppointment;}
    public int getTimeOfAppointment() {return timeOfAppointment;}

    //Setter
    public void setId(long id) {this.id = id;}
    public void setOwnerId(long ownerId) {this.ownerId = ownerId;}
    public void setAcquirerId(long acquirerId) {this.acquirerId = acquirerId;}
    public void setListingId(long listingId) {this.listingId = listingId;}
    public void setDayOfAppointment(int dayOfAppointment) {this.dayOfAppointment = dayOfAppointment;}
    public void setTimeOfAppointment(int timeOfDate) {this.timeOfAppointment = timeOfDate;}
}
