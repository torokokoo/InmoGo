package com.inmogo.api.Entity;

import jakarta.persistence.*;

import java.util.*;

@Entity
@Table(name="Property")

//Se crea la clase Propiedad donde se guardara todos los atributos que tenga un inmueble
public class Property {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id; //ID es auto incremental, no se debe rellenar en los campos
    private String name; //Nombre
    private String address; //Direccion
    private String district; //Comuna
    private String description; //Descripccion
    private String sectorDescription; //Descripccion del sector
    private ArrayList<String> images; //Listado de imagenes
    private String dimensions; //Dimensiones totales del inmueble

    // Constructor
    public Property(String name, String address, String district, String description, String sectorDescription, ArrayList<String> images, String dimensions) {
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

    // Getters y Setters
    public Long getId() { return this.id; }
    public String getName() { return this.name; }
    public String getAddress() { return this.address; }
    public String getDistrict() { return this.district; }
    public String getDescription() { return this.description; }
    public String getSectorDescription() { return this.sectorDescription; }
    public ArrayList<String> getImages() { return this.images; }
    public String getDimensions() { return this.dimensions; }

    public void setId(Long id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setAddress(String address) { this.address = address; }
    public void setDistrict(String district) { this.district = district; }
    public void setDescription(String description) { this.description = description; }
    public void setSectorDescription(String sectorDescription) { this.sectorDescription = sectorDescription; }
    public void setImages(ArrayList<String> images) { this.images = images; }
    public void setDimensions(String dimensions) { this.dimensions = dimensions; }
}


/*
PENDIENTE POR HACER
Ni idea de como hacerlo

-ConseguirImagenes(): return void
 */


