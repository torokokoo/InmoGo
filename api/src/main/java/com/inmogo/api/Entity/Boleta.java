package com.inmogo.api.Entity;

import java.sql.Timestamp;

public class Boleta {
    //Atributos
    private String tipoDePago;
    private int totalPagado;
    private int numeroDeBoleta;
    private Timestamp fecha;
    private String rutVendedor;

    //Constructor
    public Boleta(String tipoDePago,int totalPagado, int numeroDeBoleta, Timestamp fecha, String rutVendedor){
        this.tipoDePago = tipoDePago;
        this.totalPagado = totalPagado;
        this.numeroDeBoleta = numeroDeBoleta;
        this.fecha = fecha;
        this.rutVendedor = rutVendedor;
    }

    //Getters
    public String getTipoDePago(){return this.tipoDePago;}
    public int getTotalPagado(){return this.totalPagado;}
    public int getNumeroDeBoleta(){return this.numeroDeBoleta;}
    public Timestamp getFecha(){return this.fecha;}
    public String getRutVendedor(){return this.rutVendedor;}

    //Setters
    public void setTipoDePago(String tipoDePago){this.tipoDePago = tipoDePago;}
    public void setTotalPagado(int totalPagado){this.totalPagado = totalPagado;}
    public void setNumeroDeBoleta(int numeroDeBoleta){this.numeroDeBoleta = numeroDeBoleta;}
    public void setFecha(Timestamp fecha){this.fecha = fecha;}
    public void setRutVendedor(String rutVendedor){this.rutVendedor = rutVendedor;}

    //Otros Metodos
    public void imprimirBoleta(){}
    public void pagoWeb(){}
}
