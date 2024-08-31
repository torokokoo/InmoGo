package com.inmogo.api.Controller;

import java.util.ArrayList;

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


    public Long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    public boolean isSale() {
        return sale;
    }

    public void setSale(boolean sale) {
        this.sale = sale;
    }

    public boolean isHouse() {
        return house;
    }

    public void setHouse(boolean house) {
        this.house = house;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<String> getImages() {
        return images;
    }

    public void setImages(ArrayList<String> images) {
        this.images = images;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDimensions() {
        return dimensions;
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getSectorDescription() {
        return sectorDescription;
    }

    public void setSectorDescription(String sectorDescription) {
        this.sectorDescription = sectorDescription;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public ArrayList<ArrayList<Boolean>> getReservations() {
        return reservations;
    }

    public void setReservations(ArrayList<ArrayList<Boolean>> reservations) {
        this.reservations = reservations;
    }
}

