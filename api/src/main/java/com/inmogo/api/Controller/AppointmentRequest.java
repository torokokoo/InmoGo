package com.inmogo.api.Controller;

/**
 * Representa una solicitud para crear una cita.
 * Contiene la información necesaria para agendar una cita entre un propietario y un adquiriente para una publicación específica en una fecha determinada.
 * 
 * Atributos:
 * - ownerId: ID del propietario que solicita la cita.
 * - acquirerId: ID del adquiriente que será el destinatario de la cita.
 * - listingId: ID de la publicación asociada a la cita.
 * - unixDate: La fecha de la cita en formato Unix (timestamp).
 */

public class AppointmentRequest {
    private Long ownerId;
    private Long acquirerId;
    private Long listingId;
    private long unixDate;

    // Getters y Setters

    /**
     * Obtiene el ID del propietario.
     *
     * @return ID del propietario.
     */
    public Long getOwnerId() {
        return ownerId;
    }

    /**
     * Modifica el ID del propietario.
     *
     * @param ownerId El ID del propietario a modificar.
     */
    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * Obtiene el ID del adquiriente.
     * 
     * @return ID del aquiriente.
     */
    public Long getAcquirerId() {
        return acquirerId;
    }

    /**
     * Modifica el ID del adquiriente.
     * 
     * @param acquirerId El ID del adquiriente.
     */
    public void setAcquirerId(Long acquirerId) {
        this.acquirerId = acquirerId;
    }

    /**
     * Obtiene el ID de la publicación.
     * 
     * @return ID de la publicación.
     */
    public Long getListingId() {
        return listingId;
    }

    /**
     * Modifica el ID de la publicación.
     * 
     * @param listingId El ID de la publicación a modificar.
     */
    public void setListingId(Long listingId) {
        this.listingId = listingId;
    }

    /**
     * Obtiene la fecha en formato Unix.
     * 
     * @return Fecha en formato Unix.
     */
    public long getUnixDate() {
        return unixDate;
    }

    /**
     * Modifica la fecha en formato Unix.
     * 
     * @param unixDate La fecha en formato Unix a modificar.
     */
    public void setUnixDate(long unixDate) {
        this.unixDate = unixDate;
    }
}

