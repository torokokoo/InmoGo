package com.inmogo.api.Entity;

import jakarta.persistence.*;
import java.sql.Timestamp;
import java.util.ArrayList;

@Entity
@Table(name="Listing")
public class Listing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id; // ID es auto incremental, no se debe rellenar en los campos

    @ManyToOne
    @JoinColumn(name = "owner_id", nullable = false)
    private UserTemplate ownerID; // Relación con la clase Owner, llave foranea

    private boolean verified; //Revisa si la publicacion fue verificada por un administrador.
    private int rankingPos; //Ranking, no se debe rellenar en los campos, esto se hace automatico al momento de crear
    private Timestamp publishDate; //Tiempo en el que se publico, no se debe rellenar en los campos, se calcula cuando se crea
    private Timestamp expired; //atributo que indica la fecha de expiracion de la publicacion
    private boolean sale; // atributo que si es true es una compra y false es un arriendo
    private boolean house; // atributo que si es true es una casa y false es un departamento
    private String title; //Titulo
    private ArrayList<String> images; //Listado de imagenes
    private String description; //Descripccion
    private String dimensions; //Dimensiones totales del inmueble
    private String address; //Direccion
    private String district; //Comuna
    private String sectorDescription; //Descripccion del sector
    private int price; //Precio del inmueble
    private ArrayList<ArrayList<Boolean>> reservations; //7*12 = 84,
    //Son las reservaciones disponibles de la publicacion
    //7 por los dias de la semana, 12 por las 12 horas del dia laboral
    private long ownerId;

    // Constructores
    public Listing(int rankingPos, Timestamp publishDate, Timestamp expired, boolean sale, boolean house, String title, ArrayList<String> images, String description, String dimensions, String address, String district, String sectorDescription, int price, ArrayList<ArrayList<Boolean>> reservations, long ownerId) {
        this.verified = false; // Inicializar como false
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

    public Listing() {
        this.verified = false; // Inicializar como false
    }

    // Getters y Setters
    public Long getId(){ return this.id; }
    public UserTemplate getOwnerID() {return ownerID;}
    public boolean getVerified() {return verified;}
    public int getRankingPos(){ return this.rankingPos; }
    public Timestamp getPublishDate(){ return this.publishDate; }
    public Timestamp getExpired() {return expired;}
    public boolean getHouse() {return house;}
    public boolean getSale() {return sale;}
    public String getTitle(){ return this.title; }
    public String getAddress() { return address; }
    public String getDistrict() {return district;}
    public String getDescription() {return description;}
    public String getSectorDescription() {return sectorDescription;}
    public ArrayList<String> getImages() {return images;}
    public String getDimensions() {return dimensions;}
    public int getPrice() { return price;}
    public ArrayList<ArrayList<Boolean>> getReservations() {return reservations;}
    public long getOwnerId() { return ownerId; };

    //Setters
    public void setId(Long id){ this.id = id; }

    public void setOwnerID(UserTemplate owner) {this.ownerID = owner;}//establecer la llave foranea de owner

    public void setVerified(boolean verified) { this.verified = verified; }
    public void setRankingPos(int rankingPos){ this.rankingPos = rankingPos; }
    public void setPublishDate(Timestamp publishDate){ this.publishDate = publishDate; }
    public void setExpired(Timestamp expired) {this.expired = expired;}
    public void setHouse(boolean house) {this.house = house;}
    public void setSale(boolean sale) {this.sale = sale;}
    public void setTitle(String title){ this.title = title; }
    public void setAddress(String address) {this.address = address;}
    public void setDistrict(String district) {this.district = district;}
    public void setDescription(String description) { this.description = description; }
    public void setSectorDescription(String sectorDescription) { this.sectorDescription = sectorDescription; }
    public void setImages(ArrayList<String> images) { this.images = images; }
    public void setDimensions(String dimensions) { this.dimensions = dimensions; }
    public void setPrice(int price) { this.price = price;}
    public void setReservations(ArrayList<ArrayList<Boolean>> reservations) { this.reservations = reservations; }
    public void setOwnerId(long ownerId) { this.ownerId = ownerId; }
}
