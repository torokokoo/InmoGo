package com.inmogo.api.Entity;
import jakarta.persistence.Entity;
import jakarta.persistence.*;

/**
 * Clase que representa a un usuario mantenedor en el sistema.
 * 
 * La clase {@code UserMod} extiende {@link UserTemplate} y se utiliza para representar a los usuarios
 * que tienen el rol de Mantenedor. Esta clase está anotada con {@code @Entity} para que JPA la maneje
 * como una entidad en la base de datos.
 * 
 * @see UserTemplate
 */

@Entity
@DiscriminatorValue("Mod")

public class UserMod extends UserTemplate {

    /**
     * Constructor que inicializa un usuario Mantenedor con los parámetros proporcionados.
     * Este constructor llama al constructor de la superclase {@link UserTemplate} y establece el rol
     * del usuario a 2, que representa el rol de Mantenedor.
     *
     * @param id Identificador del usuario mantenedor.
     * @param name Nombre del usuario mantenedor.
     * @param rut RUT del usuario mantenedor.
     * @param email Correo electrónico del usuario mantenedor.
     * @param password Contraseña del usuario mantenedor.
     */
    public UserMod(long id, String name, String rut, String email, String password) {
        super(id, name, rut, email, password, 2); 
    }

    /**
     * Constructor predeterminado que inicializa un usuario mantenedor con valores por defecto.
     * Este constructor llama al constructor predeterminado de la superclase {@link UserTemplate} y establece
     * el rol del usuario a 2 (Mantenedor).
     */
    public UserMod() {
        super();
        this.setRole(2); 
    }

}
