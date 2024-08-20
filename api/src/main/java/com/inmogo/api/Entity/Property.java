package com.inmogo.api.Entity;

import jakarta.persistence.*;

/**
 * Propiedades
 */

@Entity
@Table(name="Property")
public class Property {
    // Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String address;
    private String district;
    private String description;
    private String sectorDescription;
    private String dimensions;
    //private ArrayList<String> images;

    // Constructor
    public Property(long id, String name, String address, String district, String description, String sectorDescription, String dimensions) { //, ArrayList<String> images
        this.id = id;
        this.name = name;
        this.address = address;
        this.district = district;
        this.description = description;
        this.sectorDescription = sectorDescription;
        this.dimensions = dimensions;
        //this.images = images;
    }

    public Property(){

    }

    // Rescates
    public long getId(){ return id; }
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
    public String getDimensions() {
        return dimensions;
    }
    //public ArrayList<String> getImages() { return images; }

    // Modificadores, establecedores
    public void setId(long id){ this.id = id;}
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
    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }
    //public void setImages(ArrayList<String> images) { this.images = images; }
}