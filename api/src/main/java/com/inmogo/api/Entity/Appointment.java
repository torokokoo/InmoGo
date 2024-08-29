package com.inmogo.api.Entity;

import jakarta.persistence.*;


@Entity
@Table(name="Appointment")
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "owner_id", nullable = false)
    private Owner owner;

    @ManyToOne
    @JoinColumn(name = "acquirer_id", nullable = false)
    private Acquirer acquirer;

    @ManyToOne
    @JoinColumn(name = "listing_id", nullable = false)
    private Listing listing;

    // Estos dos valores son coordenadas de la matriz de Agendas.
    private int dayOfAppointment; // puede ser valor entre 1 y 7
    private int timeOfAppointment; // puede ser valor entre 1 y 12

    // Constructor
    public Appointment(int dayOfAppointment, int timeOfAppointment) {

        this.dayOfAppointment = dayOfAppointment;
        this.timeOfAppointment = timeOfAppointment;
    }

    public Appointment() {}

    // Getter
    public long getId() { return id; }
    public Owner getOwner() { return owner; }
    public Acquirer getAcquirer() { return acquirer; }
    public Listing getListing() { return listing; }
    public int getDayOfAppointment() { return dayOfAppointment; }
    public int getTimeOfAppointment() { return timeOfAppointment; }

    // Setter
    public void setId(long id) { this.id = id; }
    public void setOwner(Owner owner) { this.owner = owner; }
    public void setAcquirer(Acquirer acquirer) { this.acquirer = acquirer; }
    public void setListing(Listing listing) { this.listing = listing; }
    public void setDayOfAppointment(int dayOfAppointment) { this.dayOfAppointment = dayOfAppointment; }
    public void setTimeOfAppointment(int timeOfAppointment) { this.timeOfAppointment = timeOfAppointment; }
}
