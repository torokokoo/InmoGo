package com.inmogo.api.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.*;

/**
 * Usuarios Arrendatarios.
 */

@Entity
@DiscriminatorValue("UserAcquirer")
public class UserAcquirer extends UserTemplate {
    //Construct
    public UserAcquirer(long id, String name, String rut, String email, String password, String role, String permission) {
        super(id, name, rut, email, password, role, permission);
    }

    public UserAcquirer() {
        super();
    }
}

/*
PENDIENTE HACER, y ver que va en servicio:
- ContactarVendedor(): return void
- Pagar(): return void
- AgendarVisita(): return void
 */