package com.inmogo.api.Entity;

import jakarta.persistence.*;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.ArrayList;

@Entity
@Table(name="Listing")
public class Listing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "owner_id", nullable = false)
    private UserTemplate owner; // Relación con la clase UserTemplate, llave foránea

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
    public Listing(int rankingPos, Timestamp publishDate, Timestamp expired, boolean sale, boolean house, String title, ArrayList<String> images, String description, String dimensions, String address, String district, String sectorDescription, int price, ArrayList<ArrayList<Boolean>> reservations, UserTemplate owner) {
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
        this.owner = owner;
    }

    public Listing() {
        this.verified = false;
    }

    // Getters y Setters


    public Long getId(){ return this.id; }
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
    public UserTemplate getOwnerId() { return ownerId; };

    //Setters
    public void setId(Long id){ this.id = id; }
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
    public void setOwnerId(UserTemplate ownerId) { this.ownerId = ownerId; }
}
