package com.inmogo.api.Entity;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name="Listing")

//Se crea la clase Publicacion se rellana al momento de querer publicar y va en conjunto a la propiedad
public class Listing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id; //ID es auto incremental, no se debe rellenar en los campos
    private String title; //Titulo
    private Timestamp publishDate; //Tiempo en el que se publico, no se debe rellenar en los campos, se calcula cuando se crea
    private String notesFromPropietary; // Comentarios de propietario
    private int rankingPos; //Ranking, no se debe rellenar en los campos, esto se hace automatico al momento de crear
    private int price; //Precio del inmueble
    private long propertyID;

    // Constructores
    public Listing(String title, Timestamp publishDate, String notesFromPropietary, int rankingPos, int price, long propertyID){
        this.title = title;
        this.publishDate = publishDate;
        this.notesFromPropietary = notesFromPropietary;
        this.rankingPos = rankingPos;
        this.price = price ;
        this.propertyID = propertyID;
    }

    public Listing() {

    }


    // Getters y Setters
    public Long getId(){ return this.id; }
    public String getTitle(){ return this.title; }
    public Timestamp getPublishDate(){ return this.publishDate; }
    public String getNotesFromPropietary(){ return this.notesFromPropietary; }
    public int getRankingPos(){ return this.rankingPos; }
    public int getPrice() { return price;}
    public long getPropertyID() { return propertyID;}


    public void setId(Long id){ this.id = id; }
    public void setTitle(String title){ this.title = title; }
    public void setPublishDate(Timestamp publishDate){ this.publishDate = publishDate; }
    public void setNotesFromPropietary(String notesFromPropietary){ this.notesFromPropietary = notesFromPropietary; }
    public void setRankingPos(int rankingPos){ this.rankingPos = rankingPos; }
    public void setPropertyID(long propertyID) { this.propertyID = propertyID;}
    public void setPrice(int price) { this.price = price;}

}
