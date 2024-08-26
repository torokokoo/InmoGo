package com.inmogo.api.Entity;
import jakarta.persistence.Entity;
import jakarta.persistence.*;

@Entity
@DiscriminatorValue("Mod")

public class UserMod extends UserTemplate {
    // Constructor con parámetros
    public UserMod(long id, String name, String rut, String email, String password) {
        super(id, name, rut, email, password, 2); // Establece el rol a 1
    }

    // Constructor por defecto
    public UserMod() {
        super();
        this.setRole(2); // Establece el rol a 2 (Mantenedor)
    }

}
