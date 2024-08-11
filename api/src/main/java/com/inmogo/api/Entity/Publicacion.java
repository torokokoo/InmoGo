package com.inmogo.api.Entity;

import java.sql.Timestamp;

public class Publicacion {
    //Atributos
    private String titulo;
    private Timestamp fecha;
    private String notasPropietario;
    private int rankingPos;

    //Construct
    public Publicacion(String titulo, Timestamp fecha, String notasPropietario, int rankingPos){
        this.titulo = titulo;
        this.fecha = fecha;
        this.notasPropietario = notasPropietario;
        this.rankingPos = rankingPos;
    }

    //Getter
    public String getTitulo(){return this.titulo;}
    public Timestamp getFecha(){return this.fecha;}
    public String getNotasPropietario(){return this.notasPropietario;}
    public int getRankingPos(){return this.rankingPos;}

    //Setter
    public void setTitulo(String titulo){this.titulo = titulo;}
    public void setFecha(Timestamp fecha){this.fecha = fecha;}
    public void setNotasPropietario(String notasPropietario){this.notasPropietario = notasPropietario;}
    public void setRankingPos(int rankingPos){this.rankingPos = rankingPos;}

    //Metodos
    public void SolicitarFormulario(){}
}
