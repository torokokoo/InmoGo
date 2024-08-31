package com.inmogo.api.Entity;

import jakarta.persistence.*;
import java.sql.Timestamp;

/**
 * La clase Ticket representa un comprobante de pago en un sistema de simulación de pagos.
 * Esta clase contiene información relevante sobre el tipo de pago, el monto total pagado,
 * la fecha de emisión, y los datos del vendedor.
 * 
 * El campo id es auto-incremental, por lo que no debe ser rellenado manualmente.
 * 
 * Atributos principales:
 * - paymentType: Tipo de pago.
 * - totalPaid: El monto total pagado.
 * - ticketID: Número único de la boleta.
 * - date: La fecha de emisión del ticket.
 * - sellerRUT: RUT del vendedor que emitió la boleta.
 * 
 * La clase proporciona constructores para inicializar una boleta con valores específicos,
 * así como un constructor por defecto que establece valores predeterminados.
 * También se incluyen métodos para acceder y modificar los atributos de la clase.
 * 
 * Los métodos para imprimir la boleta y realizar pagos a través del sistema de simulación de pagos
 * (similar a WebPay) no se encuentra implementada.
 * 
 */	

@Entity
@Table(name="Ticket")

public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; //ID es auto incremental, no se debe rellenar en los campos
    private String paymentType; //tipoDePago, puede ser Boleta o Factura
    private int totalPaid; //Total pagado
    private int ticketID; //Numero de boleta
    private Timestamp date; //Fecha
    private String sellerRUT; //Rut vendedor

    // Constructores

    /**
     * Constructor que inicializa una nueva instancia de Ticket con los valores proporcionados.
     *
     * @param paymentType El tipo de pago.
     * @param totalPaid El monto total pagado.
     * @param ticketID ID del ticket.
     * @param date La fecha de emisión de la boleta. 	
     * @param sellerRUT RUT del vendedor.
     */
    public Ticket(String paymentType, int totalPaid, int ticketID, Timestamp date, String sellerRUT) {
        this.paymentType = paymentType;
        this.totalPaid = totalPaid;
        this.ticketID = ticketID;
        this.date = date;
        this.sellerRUT = sellerRUT;
    }

    /**
     * Constructor por defecto que inicializa una instancia de Ticket con valores predeterminados.
     * El tipo de pago es "Boleta", el total pagado es 0, el ID de la boleta es 1, la fecha es la actual,
     * y el RUT del vendedor es "12345678-9".
     */
    public Ticket(){
        this.paymentType = "Boleta";
        this.totalPaid = 0;
        this.ticketID = 1;
        this.date = new Timestamp(System.currentTimeMillis());
        this.sellerRUT = "12345678-9";
    }

    // Getters

    /**
     * Obtiene el ID de la boleta.
     *
     * @return ID de la boleta
     */
    public Long getId() { return id; }

    /**
     * Obtiene el tipo de pago.
     *
     * @return Tipo de pago.
     */
    public String getPaymentType() { return paymentType; }

    /**
     * Obtiene el total pagado de propiedad.
     *
     * @return Total pagado por la propiedad
     */
    public int getTotalPaid() { return totalPaid; }

    /**
     * Obtiene el identificador de la boleta.
     *
     * @return Identificador de la boleta.
     */
    public int getTicketID() { return ticketID; }

    /**
     * Obtiene la fecha de emisión de la boleta.
     * 
     * @return Fecha de emisión de la boleta.
     */
    public Timestamp getDate() { return date; }

    /**
     * Obtiene el RUT del vendedor.
     *
     * @return El RUT del vendedor
     */
    public String getSellerRUT() { return sellerRUT; }

    // Setters

    /**
     * Modificador del ID de la boleta.
     *
     * @param id Nuevo ID de la boleta.
     */
    public void setId(Long id) { this.id = id; }

    /**
     * Modifica el tipo de pago.
     * 
     * @param paymentType Nuevo tipo de pago.
     */
    public void setPaymentType(String paymentType) { this.paymentType = paymentType; }

    /**
     * Modifica el total pagado de la propiedad.
     *
     * @param totalPaid Nuevo total pagado de la propiedad.
     */
    public void setTotalPaid(int totalPaid) { this.totalPaid = totalPaid; }

    /**
     * Modifica el ID de la boleta.
     *
     * @param ticketID Nuevo ID de la boleta.
     */
    public void setTicketID(int ticketID) { this.ticketID = ticketID; }

    /**
     * Modifica la fecha de emisión del ticket.
     *
     * @param date Fecha de emisión del ticket.
     */
    public void setDate(Timestamp date) { this.date = date; }

    /**
     * Modifica el RUT del vendedor.
     * 
     * @param sellerRUT Nuevo RUT del vendedor.
     */
    public void setSellerRUT(String sellerRUT) { this.sellerRUT = sellerRUT; }

    // Otros métodos

    /**
     * Imprime la boleta que indica pago de la propiedad. (Método aún no implementado)
     */
    public void printTicket(){ 
        //TODO
    }

    /**
     * Realiza el pago a través de un sistema simulado parecido a WebPay. (Método aún no implementado)
     * Se tiene en mente implementar un menú con dos opciones que indiquen si se realizó el pago:
     * 1. Se realizó el pago.
     * 2. No se realizo el pago
     */
    public void webPay(){ 
        //TODO
    }
}
