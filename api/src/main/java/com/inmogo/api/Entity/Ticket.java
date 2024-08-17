package com.inmogo.api.Entity;

import java.sql.Timestamp;

public class Ticket { //Boleta
    //Attrib.
    private String paymentType; //tipoDePago, puede ser Boleta o Factura
    private int totalPaid; //totalPagado
    private int ticketID; //numeroDeBoleta
    private Timestamp date; //fecha
    private String sellerRUT; //rutVendedor

    //Construct
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
        this.date = new Timestamp(System.currentTimeMillis());;
        this.sellerRUT = "12345678-9";
    }

    //Getter
    public String getPaymentType() { return paymentType; }
    public int getTotalPaid() { return totalPaid; }
    public int getTicketID() { return ticketID; }
    public Timestamp getDate() { return date; }
    public String getSellerRUT() { return sellerRUT; }

    //Setter
    public void setPaymentType(String paymentType) { this.paymentType = paymentType; }
    public void setTotalPaid(int totalPaid) { this.totalPaid = totalPaid; }
    public void setTicketID(int ticketID) { this.ticketID = ticketID; }
    public void setDate(Timestamp date) { this.date = date; }
    public void setSellerRUT(String sellerRUT) { this.sellerRUT = sellerRUT; }

    //Other
    public void printTicket(){
        // TODO
    }

    public void webPay(){
        //Es simulado.
    }
}
