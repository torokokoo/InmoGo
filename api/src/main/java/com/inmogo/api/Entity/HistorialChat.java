package com.inmogo.api.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.sql.Timestamp;

@Entity
@Table(name = "HistorialChat")

public class HistorialChat {
    //atributos
    private String Conversacion;
    private String RutReceptor;
    private Timestamp FechaInt;

    //constructor
    public HistorialChat(String conversacion, String rutReceptor, Timestamp fechaInt) {
        Conversacion = conversacion;
        RutReceptor = rutReceptor;
        FechaInt = fechaInt;
    }

    //getters y setters

    public String getConversacion() {
        return Conversacion;
    }

    public void setConversacion(String conversacion) {
        Conversacion = conversacion;
    }

    public String getRutReceptor() {
        return RutReceptor;
    }

    public void setRutReceptor(String rutReceptor) {
        RutReceptor = rutReceptor;
    }

    public Timestamp getFechaInt() {
        return FechaInt;
    }

    public void setFechaInt(Timestamp fechaInt) {
        FechaInt = fechaInt;
    }

    //metodos
    public void mostrarConversacion(){
        System.out.printf("\n" + getConversacion() + "\n");
    }
}
