package com.inmogo.api.Entity;

import jakarta.persistence.*;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.ArrayList;

/**
 * La clase Listing representa una publicación de una propiedad inmobiliaria dentro del sistema.
 * 
 * Esta clase contiene detalles como el título, la dirección, la descripción, el precio, y el estado
 * de la propiedad (en venta o renta, casa o departamento). También maneja información relacionada con 
 * las imágenes de la propiedad y las reservas.
 * 
 * La clase utiliza JPA (Java Persistence API) para mapear la clase a una tabla en la base de datos,
 * permitiendo la persistencia de los objetos Listing en la base de datos. La relación con el dueño
 * de la propiedad es de tipo Many-to-One, lo que significa que múltiples publicaciones pueden pertenecer
 * a un mismo usuario.
 */

@Entity
@Table(name="Listing")
public class Listing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "owner_id", nullable = false)
    private UserTemplate ownerId; // Relación con la clase UserTemplate, llave foránea

    private boolean verified;
    private int rankingPos;
    private Timestamp publishDate;
    private Timestamp expired;
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

    // Constructores

    /**
     * Constructor completo para la clase Listing.
     * 
     * @param rankingPos La posición de la propiedad publicada en el ranking de la publicación.
     * @param publishDate La fecha de publicación de la propiedad.
     * @param expired La fecha de expiración de la publicación.
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
     * @param ownerId ID del propietario de la publicación.
     */
    public Listing(int rankingPos, Timestamp publishDate, Timestamp expired, boolean sale, boolean house, String title, ArrayList<String> images, String description, String dimensions, String address, String district, String sectorDescription, int price, ArrayList<ArrayList<Boolean>> reservations, UserTemplate ownerId) {
        this.verified = false;
        this.rankingPos = rankingPos;
        this.publishDate = publishDate;
        this.expired = expired;
        this.sale = sale;
        this.house = house;
        this.title = title;
        this.images = images;
        this.description = description;
        this.dimensions = dimensions;
        this.address = address;
        this.district = district;
        this.sectorDescription = sectorDescription;
        this.price = price;
        this.reservations = reservations;
        this.ownerId = ownerId;
    }

    /**
     * Constructor por defecto para la clase Listing.
     * Inicializa una publicación no verificada.
     */
    public Listing() {
        this.verified = false;
    }

    // Getters y Setters

    /**
     * Obtiene el ID de la publicación.
     * 
     * @return ID de la publicación.
     */
    public Long getId(){ return this.id; }

    /**
     * Indica si la publicación está verificada.
     *
     * @return true si está verificada, false en caso contrario.
     */
    public boolean getVerified() {return verified;}

    /**
     * Obtiene la posición en el ranking de la publicación de una propiedad.
     *
     * @return La posición en el ranking. 
     */
    public int getRankingPos(){ return this.rankingPos; }

    /**
     * Obtiene la fecha de publicación de la propiedad.
     *
     * @return La fecha de publicación.
     */
    public Timestamp getPublishDate(){ return this.publishDate; }

    /**
     * Obtiene la fecha de expiración de la publicación.
     *
     * @return La fecha de expiración.
     */
    public Timestamp getExpired() {return expired;}

    /**
     * Obtiene el estado de si la publicación es una casa o un departamento.
     * 
     * @return true si la publicación es una casa, false si la publicación es un departamento.
     */
    public boolean getHouse() {return house;}

    /**
     * Obtiene el estado de venta o arriendo de la publicación.
     *
     * @return true si la publicación está en venta, false si esta en arriendo.
     */
    public boolean getSale() {return sale;}

    /**
     * Obtiene el título de la publicación.
     * 
     * @return Título de la publicación.
     */
    public String getTitle(){ return this.title; }

    /**
     * Obtiene la dirección de la propiedad.
     *
     * @return Dirección de la propiedad.
     */
    public String getAddress() { return address; }

    /**
     * Obtiene la comuna de la propiedad.
     *
     * @return Comuna de la propiedad.
     */
    public String getDistrict() {return district;}

    /**
     * Obtiene la descripción de la publicación.
     *
     * @return Descripción de la publicación.
     */
    public String getDescription() {return description;}

    /**
     * Obtiene la descripción del sector relacionado con la propiedad.
     * 
     * @return La descripción del sector de la propiedad.
     */
    public String getSectorDescription() {return sectorDescription;}

    /**
     * Obtiene la lista de imágenes asociadas a la publicación.
     * 
     * @return Lista de imágenes.
     */
    public ArrayList<String> getImages() {return images;}

    /**
     * Obtiene las dimensiones de la propiedad.
     * 
     * @return Dimensiones de la propiedad.
     */
    public String getDimensions() {return dimensions;}

    /**
     * Obtiene el precio de la propiedad.
     *
     * @return Precio de propiedad.
     */
    public int getPrice() { return price;}

    /**
     * Obtiene la lista de reservas para la publicación. 
     *
     * @return Lista de reservas de publicación.
     */
    public ArrayList<ArrayList<Boolean>> getReservations() {return reservations;}

    /**
     * Obtiene el ID del usuario propietario de la publicación.
     * 
     * @return ID del usuario propietario.
     */
    public UserTemplate getOwnerId() { return ownerId; };

    //Setters

    /**
     * Modifica el ID de la publicación.
     *
     * @param id ID de la publicación.
     */
    public void setId(Long id){ this.id = id; }

    /**
     * Modifica la verificación de la publicación.
     *
     * @param verified true para verificar la publicación, false en caso contrario.
     */
    public void setVerified(boolean verified) { this.verified = verified; }

    /**
     * Modifica la posición en el ranking de la publicación de una propiedad.
     *
     * @param rankingPos La posición en el ranking.
     */
    public void setRankingPos(int rankingPos){ this.rankingPos = rankingPos; }

    /**
     * Modifica la fecha de publicación de la propiedad.
     *
     * @param publishDate Fecha de publicación.
     */
    public void setPublishDate(Timestamp publishDate){ this.publishDate = publishDate; }

    /**
     * Modifica la fecha de expiración de la publicación.
     *
     * @param expired Fecha de expiración de la publicación. 
     */
    public void setExpired(Timestamp expired) {this.expired = expired;}

    /**
     * Modifica el tipo de publicación como casa o departamento.
     * 
     * @param house true si la publicación es una casa, false si es un departamento.
     */
    public void setHouse(boolean house) {this.house = house;}

    /**
     * Modificar el estado de venta o arriendo de la publicación.
     * 
     * @param sale Estado modificado de la publicación.
     */
    public void setSale(boolean sale) {this.sale = sale;}

    /**
     * Modifica el título de la publicación.
     *
     * @param title Nuevo título de la publicación.
     */
    public void setTitle(String title){ this.title = title; }

    /**
     * Modifica la dirección de la propiedad.
     * 
     * @param address Nueva dirección de la propiedad.
     */
    public void setAddress(String address) {this.address = address;}

    /**
     * Modifica la comuna donde se encuentra la propiedad.
     *
     * @param district Nueva comuna de la propiedad.
     */
    public void setDistrict(String district) {this.district = district;}

    /**
     * Modifica la descripción de la publicación.
     *
     * @param description Descripción modificada de la publicación.
     */
    public void setDescription(String description) { this.description = description; }

    /**
     * Modifica la descripción del sector relacionado con la propiedad.
     * 
     * @param sectorDescription Nueva descripción del sector.
     */
    public void setSectorDescription(String sectorDescription) { this.sectorDescription = sectorDescription; }

    /**
     * Modifica la lista de imágenes asociadas a la publicación.
     *
     * @param images Lista de imágenes modificada.
     */
    public void setImages(ArrayList<String> images) { this.images = images; }

    /**
     * Modifica las dimensiones de la propiedad.
     *
     * @param dimensions Nueva dimensión de la propiedad.
     */
    public void setDimensions(String dimensions) { this.dimensions = dimensions; }

    /**
     * Modifica el precio de la propiedad.
     *
     * @param price Nuevo precio de la propiedad.
     */
    public void setPrice(int price) { this.price = price;}

    /**
     * Modifica la lista de reservas para la publicación.
     * 
     * @param reservations Lista de reservas de publicación modificada.
     */
    public void setReservations(ArrayList<ArrayList<Boolean>> reservations) { this.reservations = reservations; }

    /**
     * Modifica el ID del propietario de la publicación.
     * 
     * @param ownerId ID del propietario a modificar.
     */
    public void setOwnerId(UserTemplate ownerId) { this.ownerId = ownerId; }
}
