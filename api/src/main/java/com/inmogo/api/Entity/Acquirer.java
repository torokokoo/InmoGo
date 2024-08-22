package com.inmogo.api.Entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.*;
import java.util.*;
@Entity
@DiscriminatorValue("Acquirer")

//Clase de los Adquirientes de propiedades herado desde UserTemplate
public class Acquirer extends UserTemplate {

    public Acquirer(long id, String name, String rut, String email, String password, String role, String permission) {
        super(id, name, rut, email, password, role, permission);
    }

    public Acquirer() {

    }
}

/*
PENDIENTE HACER, y ver que va en servicio:
- ContactarVendedor(): return void
- Pagar(): return void
- AgendarVisita(): return void
 */