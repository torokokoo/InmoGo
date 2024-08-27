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
    private long id; //ID es auto incremental, no se debe rellenar en los campos

    private String title; //Titulo
    private String address; //Direccion
    private String district; //Comuna
    private String description; //Descripccion
    private String sectorDescription; //Descripccion del sector
    private ArrayList<String> images; //Listado de imagenes
    private String dimensions; //Dimensiones totales del inmueble
    private Timestamp publishDate; //Tiempo en el que se publico, no se debe rellenar en los campos, se calcula cuando se crea
    private int rankingPos; //Ranking, no se debe rellenar en los campos, esto se hace automatico al momento de crear
    private int price; //Precio del inmueble
    private boolean verified; //Revisa si la publicacion fue verificada por un administrador.
    private ArrayList<ArrayList<Boolean>> reservations; //7*12 = 84,
    //Son las reservaciones disponibles de la publicacion
    //7 por los dias de la semana, 12 por las 12 horas del dia laboral
    private boolean house; // atributo que si es true es una casa y false es un departamento
    private boolean sale; // atributo que si es true es una compra y false es un arriendo

    // Constructores
    public Listing(String title, String address, String district, String description, String sectorDescription, ArrayList<String> images, String dimensions, Timestamp publishDate, int rankingPos, int price, ArrayList<ArrayList<Boolean>> reservations, boolean house, boolean sale) {
        this.title = title;
        this.address = address;
        this.district = district;
        this.description = description;
        this.sectorDescription = sectorDescription;
        this.images = images;
        this.dimensions = dimensions;
        this.publishDate = publishDate;
        this.rankingPos = rankingPos;
        this.price = price;
        this.verified = false;
        this.reservations = reservations;
        this.house = house;
        this.sale = sale;
    }

    public Listing() {}

    // Getters y Setters
    public Long getId(){ return this.id; }
    public String getTitle(){ return this.title; }
    public String getAddress() { return address; }
    public String getDistrict() {return district;}
    public String getDescription() {return description;}
    public String getSectorDescription() {return sectorDescription;}
    public ArrayList<String> getImages() {return images;}
    public String getDimensions() {return dimensions;}
    public Timestamp getPublishDate(){ return this.publishDate; }
    public int getRankingPos(){ return this.rankingPos; }
    public int getPrice() { return price;}
    public boolean getVerified() {return verified;}
    public ArrayList<ArrayList<Boolean>> getReservations() {return reservations;}
    public boolean getHouse() {return house;}
    public boolean getSale() {return sale;}

    //Setters
    public void setId(Long id){ this.id = id; }
    public void setTitle(String title){ this.title = title; }
    public void setAddress(String address) {this.address = address;}
    public void setDistrict(String district) {this.district = district;}
    public void setDescription(String description) { this.description = description; }
    public void setSectorDescription(String sectorDescription) { this.sectorDescription = sectorDescription; }
    public void setImages(ArrayList<String> images) { this.images = images; }
    public void setDimensions(String dimensions) { this.dimensions = dimensions; }
    public void setPublishDate(Timestamp publishDate){ this.publishDate = publishDate; }
    public void setRankingPos(int rankingPos){ this.rankingPos = rankingPos; }
    public void setPrice(int price) { this.price = price;}
    public void setVerified(boolean verified) { this.verified = verified; }
    public void setReservations(ArrayList<ArrayList<Boolean>> reservations) { this.reservations = reservations; }
    public void setHouse(boolean house) {this.house = house;}
    public void setSale(boolean sale) {this.sale = sale;}
}
