package com.inmogo.api.Entity;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name="Listing")
public class Listing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Nueva columna de identidad

    private String title;
    private Timestamp publishDate;
    private String notesFromPropietary;
    private int rankingPos;

    // Constructores
    public Listing(String title, Timestamp publishDate, String notesFromPropietary, int rankingPos){
        this.title = title;
        this.publishDate = publishDate;
        this.notesFromPropietary = notesFromPropietary;
        this.rankingPos = rankingPos;
    }

    public Listing(){
        this.title = "Publicacion de Prueba";
        this.publishDate = new Timestamp(System.currentTimeMillis());
        this.notesFromPropietary = "Notas de Propietario";
        this.rankingPos = 1;
    }

    // Getters y Setters
    public Long getId(){ return this.id; }
    public String getTitle(){ return this.title; }
    public Timestamp getPublishDate(){ return this.publishDate; }
    public String getNotesFromPropietary(){ return this.notesFromPropietary; }
    public int getRankingPos(){ return this.rankingPos; }

    public void setId(Long id){ this.id = id; }
    public void setTitle(String title){ this.title = title; }
    public void setPublishDate(Timestamp publishDate){ this.publishDate = publishDate; }
    public void setNotesFromPropietary(String notesFromPropietary){ this.notesFromPropietary = notesFromPropietary; }
    public void setRankingPos(int rankingPos){ this.rankingPos = rankingPos; }

    // Métodos
    public void requestForm(){
        // contenido
    }
}
