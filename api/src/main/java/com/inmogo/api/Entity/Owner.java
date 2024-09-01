package com.inmogo.api.Entity;
import jakarta.persistence.Entity;
import jakarta.persistence.*;

/**
 * Clase que representa a un Propietario de inmuebles.
 * 
 * La clase {@code Owner} hereda de {@link UserTemplate} y se utiliza para representar a los usuarios
 * que tienen el rol de Propietario en el sistema. Un Propietario tiene un rol específico asignado
 * (en este caso, el rol 3). Esta clase está anotada con {@code @Entity} y {@code @DiscriminatorValue}
 * para su uso en una tabla de herencia en una base de datos relacional.
 * 
 * @see UserTemplate
 */

@Entity
@DiscriminatorValue("Owner")
public class Owner extends UserTemplate {

    /**
     * Constructor que inicializa un Propietario con los detalles proporcionados.
     * Este constructor llama al constructor de la superclase {@link UserTemplate} y establece el rol
     * del usuario a 3, que representa el rol de Propietario. 
     *
     * @param id Identificador del usuario propietario.
     * @param name nombre del usuario propietario.
     * @param rut RUT del usuario propietario.
     * @param email Correo electrónico del usuario propietario.
     * @param password Contraseña del usuario propietario.
     */
    public Owner(long id, String name, String rut, String email, String password) {
        super(id, name, rut, email, password, 3);
    }

    /**
     * Constructor predeterminado que inicializa un Propietario con valores por defecto.
     * Este constructor llama al constructor predeterminado de la superclase {@link UserTemplate} y establece
     * el rol del usuario a 3, que representa el rol de Propietario.
     */
    public Owner() {
        super();
        this.setRole(3); 

    }


}

