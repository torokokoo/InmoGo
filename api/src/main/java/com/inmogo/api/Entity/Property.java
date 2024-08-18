package com.inmogo.api.Entity;

import java.util.*;
import jakarta.persistence.*;
@Entity
@Table(name = "property")

public class Property {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // Atributos
    private String name;
    private String address;
    private String district;
    private String description;
    private String sectorDescription;
    private ArrayList<String> images;
    private String dimensions;

    // Constructor
    public Property(String name, String address, String district, String description,
                    String sectorDescription, ArrayList<String> images, String dimensions) {
        this.name = name;
        this.address = address;
        this.district = district;
        this.description = description;
        this.sectorDescription = sectorDescription;
        this.images = images;
        this.dimensions = dimensions;
    }

    public Property(){

    }

    // Rescates
    public String getName() {
        return name;
    }

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

    // Modificadores, establecedores
    public void setName(String name) {
        this.name = name;
    }

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
}

/*
PENDIENTE POR HACER
Ni idea de como hacerlo

-ConseguirImagenes(): return void
 */


