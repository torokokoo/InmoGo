package com.inmogo.api.Entity;

import jakarta.persistence.*;
import java.sql.Timestamp;
import java.util.ArrayList;

@Entity
@Table(name="Listing")

//Se crea la clase Publicacion se rellana al momento de querer publicar y va en conjunto a la propiedad
public class Listing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //Atributos Automaticos, se asignan automaticamente en los Controladores y Servicios
    private int rankingPos; //Posicion de la propiedad en el ranking del sitio.
    private Timestamp publishDate; //Tiempo en el que se publica la propiedad en el sitio.
    private Timestamp expireDate; //Tiempo cuando el listing expire (inicialmente 1 mes despues de publishDate, puede actualizarse)
    private boolean isVerified; //Revisa si la publicacion fue verificada por un administrador. Inicialmente false.

    //Atributos
    private boolean saleOrRent; // atributo que si es true es una compra y false es un arriendo
    private boolean houseOrApartment; // atributo que si es true es una casa y false es un departamento
    private int price; //Precio del inmueble
    private Long ownerId; //ID del Propietario de la Propiedad
    private String title; //Titulo
    private String description; //Descripccion
    private String dimensions; //Dimensiones totales del inmueble
    private String address; //Direccion
    private String district; //Comuna
    private String sectorDescription; //Descripccion del sector
    private ArrayList<String> images; //Listado de imagenes
    private ArrayList<ArrayList<Boolean>> reservations;//Reservaciones disponibles de la publicacion.
    //Internamente una matriz de 7x12; 7 por los dias de la semana, 12 por las 12 horas del dia laboral.

    //Constructor
    public Listing(int rankingPos, Timestamp publishDate, Timestamp expireDate, boolean isVerified, boolean saleOrRent,
            boolean houseOrApartment, int price, Long ownerId, String title, String description, String dimensions,
            String address, String district, String sectorDescription, ArrayList<String> images,
            ArrayList<ArrayList<Boolean>> reservations) {
        this.rankingPos = rankingPos;
        this.publishDate = publishDate;
        this.expireDate = expireDate;
        this.isVerified = isVerified;
        this.saleOrRent = saleOrRent;
        this.houseOrApartment = houseOrApartment;
        this.price = price;
        this.ownerId = ownerId;
        this.title = title;
        this.description = description;
        this.dimensions = dimensions;
        this.address = address;
        this.district = district;
        this.sectorDescription = sectorDescription;
        this.images = images;
        this.reservations = reservations;
    }

    //Constructor por defecto.
    public Listing(){
        this.publishDate = new Timestamp(System.currentTimeMillis());
        this.expireDate = new Timestamp(System.currentTimeMillis() + System.currentTimeMillis() + 30L * 24 * 60 * 60 * 1000);
        this.isVerified = false;
    }

    //Constructor Autoreferencial
    public Listing(Listing listing){
        if (listing != null){
            this.rankingPos = listing.getRankingPos();
            this.publishDate = listing.getPublishDate();
            this.expireDate = listing.getExpireDate();
            this.isVerified = listing.isVerified();
            this.saleOrRent = listing.getSaleOrRent();
            this.houseOrApartment = listing.getHouseOrApartment();
            this.price = listing.getPrice();
            this.ownerId = listing.getOwnerId();
            this.title = listing.getTitle();
            this.description = listing.getDescription();
            this.dimensions = listing.getDimensions();
            this.address = listing.getAddress();
            this.district = listing.getDistrict();
            this.sectorDescription = listing.getSectorDescription();
            this.images = listing.getImages();
            this.reservations = listing.getReservations();
        }
    }

    //Getters
    public Long getId() {return id;}
    public int getRankingPos() {return rankingPos;}
    public Timestamp getPublishDate() {return publishDate;}
    public Timestamp getExpireDate() {return expireDate;}
    public boolean isVerified() {return isVerified;}
    public boolean getSaleOrRent() {return saleOrRent;}
    public boolean getHouseOrApartment() {return houseOrApartment;}
    public int getPrice() {return price;}
    public Long getOwnerId() {return ownerId;}
    public String getTitle() {return title;}
    public String getDescription() {return description;}
    public String getDimensions() {return dimensions;}
    public String getAddress() {return address;}
    public String getDistrict() {return district;}
    public String getSectorDescription() {return sectorDescription;}
    public ArrayList<String> getImages() {return images;}
    public ArrayList<ArrayList<Boolean>> getReservations() {return reservations;}

    //Setters
    public void setId(Long id) {this.id = id;}
    public void setRankingPos(int rankingPos) {this.rankingPos = rankingPos;}
    public void setPublishDate(Timestamp publishDate) {this.publishDate = publishDate;}
    public void setExpireDate(Timestamp expireDate) {this.expireDate = expireDate;}
    public void setVerified(boolean isVerified) {this.isVerified = isVerified;}
    public void setSaleOrRent(boolean saleOrRent) {this.saleOrRent = saleOrRent;}
    public void setHouseOrApartment(boolean houseOrApartment) {this.houseOrApartment = houseOrApartment;}
    public void setPrice(int price) {this.price = price;}
    public void setOwnerId(Long ownerId) {this.ownerId = ownerId;}
    public void setTitle(String title) {this.title = title;}
    public void setDescription(String description) {this.description = description;}
    public void setDimensions(String dimensions) {this.dimensions = dimensions;}
    public void setAddress(String address) {this.address = address;}
    public void setDistrict(String district) {this.district = district;}
    public void setSectorDescription(String sectorDescription) {this.sectorDescription = sectorDescription;}
    public void setImages(ArrayList<String> images) {this.images = images;}
    public void setReservations(ArrayList<ArrayList<Boolean>> reservations) {this.reservations = reservations;}
}
