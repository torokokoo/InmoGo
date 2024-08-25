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

    // Constructores
    public Listing(String title, String address, String district, String description, String sectorDescription, ArrayList<String> images, String dimensions, Timestamp publishDate, int rankingPos, int price) {
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
    }

    public Listing() {

    }


    // Getters y Setters
    public Long getId(){ return this.id; }
    public String getTitle(){ return this.title; }

    public String getAddress() {
        return address;
    }

    public String getDistrict() {
        return district;
    }

    public String getDescription() {
        return description;
    }

    public String getSectorDescription() {
        return sectorDescription;
    }

    public ArrayList<String> getImages() {
        return images;
    }

    public String getDimensions() {
        return dimensions;
    }
    public Timestamp getPublishDate(){ return this.publishDate; }
    public int getRankingPos(){ return this.rankingPos; }
    public int getPrice() { return price;}


    //Setters

    public void setId(Long id){ this.id = id; }
    public void setTitle(String title){ this.title = title; }


    public void setAddress(String address) {
        this.address = address;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setSectorDescription(String sectorDescription) {
        this.sectorDescription = sectorDescription;
    }

    public void setImages(ArrayList<String> images) {
        this.images = images;
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }
    public void setPublishDate(Timestamp publishDate){ this.publishDate = publishDate; }
    public void setRankingPos(int rankingPos){ this.rankingPos = rankingPos; }
    public void setPrice(int price) { this.price = price;}

}
