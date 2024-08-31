package com.inmogo.api.Entity;

import jakarta.persistence.*;
import org.apache.catalina.User;

/**
 * Clase que representa una cita para una propiedad en el sistema.
 * 
 * La clase {@code Appointment} está anotada con {@code @Entity} y {@code @Table} para que JPA la maneje
 * como una entidad persistente en la base de datos. Esta entidad representa una cita entre un propietario, un 
 * adquiriente y una propiedad en una fecha específica.
 */

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

    /**
     * Constructor que inicializa una visita con los parámetros proporcionados.
     * 
     * @param ownerId ID del usuario propietario asociado a la visita.
     * @param acquirerId ID del usuario propietario asociado a la visita.
     * @param listingId ID de la publicación asociado a la visita.
     * @param unixDate La fecha y hora de la visita en formato Unix.
     */
    public Appointment(UserTemplate ownerId, UserTemplate acquirerId, Listing listingId, long unixDate) {
        this.ownerId = ownerId;
        this.acquirerId = acquirerId;
        this.listingId = listingId;
        this.unixDate = unixDate;
    }

    /**
     * Constructor predeterminado.
     * Este constructor es necesario para la deserialización y el funcionamiento de JPA.
     */
    public Appointment() {}

    // Getters y Setters

    //Getters

    /**
     * Obtiene el identificador de la visita que ha sido agendada.
     * 
     * @return Identificador de la visita agendada.
     */
    public long getId() {return id;}

    /**
     * Obtiene el identificador del usuario propietario asociado a la visita agendada. 
     *
     * @return ID del usuario propietario de la visita agendada.
     */
    public UserTemplate getOwnerId() {return ownerId;}

    /**
     * Obtiene el identificador del usuario adquiriente asociado a la visita agendada.
     * 
     * @return ID del usuario adquiriente de la visita agendada.
     */
    public UserTemplate getAcquirerId() {return acquirerId;}

    /**
     * Obtiene el identificador de la publicación asociada a la visita agendada.
     *
     * @return El identificador de la publicación asociada a la visita agendada.
     */
    public Listing getListingId() {return listingId;}

    /**
     * Obtiene la fecha y hora de la visita agendada en formato Unix.
     * 
     * @return Fecha y hora de la visita agendada en formato Unix.
     */
    public long getUnixDate() { return unixDate; }

    //Setters

    /**
     * Modifica el identificador de la visita agendada.
     * 
     * @param id Nuevo identificador de la visita agendada.
     */
    public void setId(long id) {this.id = id;}

    /**
     * Modifica el identificador del usuario propietario asociado a la visita agendada.
     *
     * @param ownerId El nuevo id del propietario asociado a la visita agendada.
     */
    public void setOwnerId(UserTemplate ownerId) {this.ownerId = ownerId;}

    /**
     * Modifica el identificador del usuario adquiriente asociado a la visita agendada.
     * 
     * @param acquirerId El nuevo id del usuario propietario asociado a la visita agendada.
     */
    public void setAcquirerId(UserTemplate acquirerId) {this.acquirerId = acquirerId;}

    /**
     * Modifica el identificador de la publicación asociada a la visita agendada.
     *
     * @param listingId El nuevo id de la publicación asociada a la visita agendada.
     */
    public void setListingId(Listing listingId) {this.listingId = listingId;}

    /**
     * Modifica la fecha y hora de la visita agendada en formato Unix.
     * 
     * @param unixDate La nueva fecha y hora de la visita agendada en formato Unix.
     */
    public void setUnixDate(Long unixDate) { this.unixDate = unixDate; }
}
