package com.inmogo.api.Entity;

import jakarta.persistence.*;
import java.sql.Timestamp;
import jakarta.persistence.*;

/**
 * Publicaciones.
 */

@Entity
@Table(name="Listing")
public class Listing {
    //Attribute
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title; //titulo
    private Timestamp publishDate; //publishDate
    private String notesFromPropietary; //notesFromPropietary
    private int rankingPos; //PosicionRanking

    //Construct
    public Listing(long id, String title, Timestamp publishDate, String notesFromPropietary, int rankingPos){
        this.id = id;
        this.title = title;
        this.publishDate = publishDate;
        this.notesFromPropietary = notesFromPropietary;
        this.rankingPos = rankingPos;
    }

    public Listing(){}

    //Getter
    public long getId(){return this.id;}
    public String getTitle(){return this.title;}
    public Timestamp getPublishDate(){return this.publishDate;}
    public String getNotesFromPropietary(){return this.notesFromPropietary;}
    public int getRankingPos(){return this.rankingPos;}

    //Setter
    public void setId(long id){this.id = id;}
    public void setTitle(String title){this.title = title;}
    public void setPublishDate(Timestamp publishDate){this.publishDate = publishDate;}
    public void setNotesFromPropietary(String notesFromPropietary){this.notesFromPropietary = notesFromPropietary;}
    public void setRankingPos(int rankingPos){this.rankingPos = rankingPos;}
}
