package com.inmogo.api.Entity;

import jakarta.persistence.*;
@Entity
@Table(name = "acquirer")

//Clase de los Adquirientes de propiedades herado desde User
public class Acquirer extends UserTemplate {
    public void contactSeller(){ //ContactarVendedor
        //TODO
    }

    public void pay(){ //Pagar
        //TODO
    }

    public void scheduleVisit(){ //Agendar Visita
        //TODO
    }
}

/*
PENDIENTE HACER, y ver que va en servicio:
- ContactarVendedor(): return void
- Pagar(): return void
- AgendarVisita(): return void
 */