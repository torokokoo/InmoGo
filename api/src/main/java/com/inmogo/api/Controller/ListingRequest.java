package com.inmogo.api.Controller;

import java.util.ArrayList;

/**
 * Solicitud para crear o actualizar una publicación (Listing).
 * 
 * Esta clase encapsula los datos necesarios para crear o actualizar una publicación en el sistema. 
 * Los atributos representan información detallada sobre la publicación, incluyendo datos del propietario, 
 * características de la publicación y detalles de reserva.
 * 
 * Atributos:
 * 
 * @param ownerId ID del propietario de la publicación.
 * @param sale Indica si la publicación está en venta (true) o en arriendo (false).
 * @param house Indica si la publicación corresponde a una casa (true) o a un departamento (false).
 * @param title Título de la publicación.
 * @param images Lista de URLs de imágenes asociadas a la publicación.
 * @param description Descripción detallada de la publicación.
 * @param dimensions Dimensiones de la propiedad.
 * @param address Dirección de la propiedad.
 * @param district Comuna en el que se encuentra la propiedad.
 * @param sectorDescription Descripción del sector donde se ubica la propiedad.
 * @param price Precio de la propiedad.
 * @param reservations Información sobre la disponibilidad de la propiedad en forma de una matriz de reservas.
 */

public class ListingRequest {
    private Long ownerId;
    private boolean sale;
    private boolean house;
    private String title;
    private ArrayList<String> images;
    private String description;
    private String dimensions;
    private String address;
    private String district;
    private String sectorDescription;
    private int price;
    private ArrayList<ArrayList<Boolean>> reservations;

    // Getters y Setters

    /**
     * Obtiene el ID del usuario propietario de la publicación.
     * 
     * @return El ID del usuario propietario.
     */
    public Long getOwnerId() {
        return ownerId;
    }

    /**
     * Modifica el ID del propietario de la publicación.
     *
     * @param ownerId El ID del propietario a modificar.
     */
    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * Obtiene el estado de venta o arriendo de la publicación.
     * 
     * @return true si la publicación está en venta, false si esta en arriendo.
     */
    public boolean isSale() {
        return sale;
    }

    /**
     * Modificar el estado de venta o arriendo de la publicación.
     * 
     * @param sale Estado modificado de la publicación. 
     */
    public void setSale(boolean sale) {
        this.sale = sale;
    }

    /**
     * Obtiene el estado de si la publicación es una casa o un departamento.
     * 
     * @return true si la publicación es una casa, false si la publicación es un departamento.
     */
    public boolean isHouse() {
        return house;
    }

    /**
     * Modifica el tipo de publicación como casa o departamento.
     *
     * @param house true si la publicación es una casa, false si es un departamento.
     */
    public void setHouse(boolean house) {
        this.house = house;
    }

    /**
     * Obtiene el título de la publicación.
     * 
     * @return Título de la publicación.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Modifica el título de la publicación.
     *
     * @param title Nuevo título de la publicación.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Obtiene la lista de imágenes asociadas a la publicación.
     * 
     * @return Lista de imágenes.
     */
    public ArrayList<String> getImages() {
        return images;
    }

    /**
     * Modifica la lista de imágenes asociadas a la publicación.
     * 
     * @param images Lista de imágenes modificada.
     */
    public void setImages(ArrayList<String> images) {
        this.images = images;
    }

    /**
     * Obtiene la descripción de la publicación.
     * 
     * @return Descripción de la publicación
     */
    public String getDescription() {
        return description;
    }

    /**
     * Modifica la descripción de la publicación.
     *
     * @param description Descripción modificada de la publicación. 
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Obtiene las dimensiones de la propiedad.
     * 
     * @return Dimensiones de la propiedad.
     */
    public String getDimensions() {
        return dimensions;
    }

    /**
     * Modifica las dimensiones de la propiedad.
     * 
     * @param dimensions Nueva dimensión de la propiedad.
     */
    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }

    /**
     * Obtiene la dirección de la propiedad.
     * 
     * @return Dirección de la propiedad.
     */
    public String getAddress() {
        return address;
    }

    /**
     * Modifica la dirección de la propiedad.
     * 
     * @param address Nueva dirección de la propiedad.
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Obtiene la comuna de la propiedad.
     * 
     * @return Comuna de la propiedad.
     */
    public String getDistrict() {
        return district;
    }

    /**
     * Modifica la comuna donde se encuentra la propiedad.
     * 
     * @param district Nueva comuna de la propiedad.
     */
    public void setDistrict(String district) {
        this.district = district;
    }

    /**
     * Obtiene la descripción del sector relacionado con la propiedad.
     * 
     * @return La descripción del sector de la propiedad.
     */
    public String getSectorDescription() {
        return sectorDescription;
    }

    /**
     * Modifica la descripción del sector relacionado con la propiedad.
     * 
     * @param sectorDescription Nueva descripción del sector.
     */
    public void setSectorDescription(String sectorDescription) {
        this.sectorDescription = sectorDescription;
    }

    /**
     * Obtiene el precio de la propiedad.
     * 
     * @return Precio de propiedad.
     */
    public int getPrice() {
        return price;
    }

    /**
     * Modifica el precio de la propiedad.  
     *
     * @param price Nuevo precio de la propiedad.
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * Obtiene la lista de reservas para la publicación.
     * 
     * @return Lista de reservas de publicación.
     */
    public ArrayList<ArrayList<Boolean>> getReservations() {
        return reservations;
    }

    /**
     * Modifica la lista de reservas para la publicación.
     * 
     * @param reservations Lista de reservas de publicación modificada.
     */
    public void setReservations(ArrayList<ArrayList<Boolean>> reservations) {
        this.reservations = reservations;
    }
}

