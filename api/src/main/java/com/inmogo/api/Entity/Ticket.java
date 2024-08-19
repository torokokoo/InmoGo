package com.inmogo.api.Entity;

import jakarta.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name="Ticket")
public class Ticket { //Boleta
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Nueva columna de identidad

    private String paymentType; //tipoDePago, puede ser Boleta o Factura
    private int totalPaid; //totalPagado
    private int ticketID; //numeroDeBoleta
    private Timestamp date; //fecha
    private String sellerRUT; //rutVendedor

    // Constructores
    public Ticket(String paymentType, int totalPaid, int ticketID, Timestamp date, String sellerRUT) {
        this.paymentType = paymentType;
        this.totalPaid = totalPaid;
        this.ticketID = ticketID;
        this.date = date;
        this.sellerRUT = sellerRUT;
    }

    public Ticket(){
        this.paymentType = "Boleta";
        this.totalPaid = 0;
        this.ticketID = 1;
        this.date = new Timestamp(System.currentTimeMillis());
        this.sellerRUT = "12345678-9";
    }

    // Getters
    public Long getId() { return id; }
    public String getPaymentType() { return paymentType; }
    public int getTotalPaid() { return totalPaid; }
    public int getTicketID() { return ticketID; }
    public Timestamp getDate() { return date; }
    public String getSellerRUT() { return sellerRUT; }

    // Setters
    public void setId(Long id) { this.id = id; }
    public void setPaymentType(String paymentType) { this.paymentType = paymentType; }
    public void setTotalPaid(int totalPaid) { this.totalPaid = totalPaid; }
    public void setTicketID(int ticketID) { this.ticketID = ticketID; }
    public void setDate(Timestamp date) { this.date = date; }
    public void setSellerRUT(String sellerRUT) { this.sellerRUT = sellerRUT; }

    // Otros métodos
    public void printTicket(){ //imprimirBoleta
        //TODO
    }

    public void webPay(){ //pagoWeb
        //TODO
        /*
         * Se tiene en mente implementar un menu que posea dos opciones que indiquen si se realizo el pago:
         *   1. Se realizo el pago
         *   2. No se realizo el pago
         */
    }
}
