package com.inmogo.api.Entity;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.time.LocalDate;

@Entity
@Table(name="listing")
public class Listing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Nueva columna de identidad

    private String title;
    private LocalDate publishDate;
    private String notesFromPropietary;
    private int rankingPos;

    // Constructores
    public Listing(String title, LocalDate publishDate, String notesFromPropietary, int rankingPos){
        this.title = title;
        this.publishDate = publishDate;
        this.notesFromPropietary = notesFromPropietary;
        this.rankingPos = rankingPos;
    }

    public Listing(){

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
