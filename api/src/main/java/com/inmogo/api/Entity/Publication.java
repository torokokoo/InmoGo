package com.inmogo.api.Entity;

import java.sql.Timestamp;

public class Publication {
    //Attributes
    private String title; //titulo
    private Timestamp publishDate; //publishDate
    private String notesFromPropietary; //notesFromPropietary
    private int rankingPos; //PosicionRanking

    //Construct
    public Publication(String title, Timestamp publishDate, String notesFromPropietary, int rankingPos){
        this.title = title;
        this.publishDate = publishDate;
        this.notesFromPropietary = notesFromPropietary;
        this.rankingPos = rankingPos;
    }

    //Getter
    public String getTitle(){return this.title;}
    public Timestamp getPublishDate(){return this.publishDate;}
    public String getNotesFromPropietary(){return this.notesFromPropietary;}
    public int getRankingPos(){return this.rankingPos;}

    //Setter
    public void setTitle(String title){this.title = title;}
    public void setPublishDate(Timestamp publishDate){this.publishDate = publishDate;}
    public void setNotesFromPropietary(String notesFromPropietary){this.notesFromPropietary = notesFromPropietary;}
    public void setRankingPos(int rankingPos){this.rankingPos = rankingPos;}

    //Metodos
    public void SolicitarFormulario(){}
}
