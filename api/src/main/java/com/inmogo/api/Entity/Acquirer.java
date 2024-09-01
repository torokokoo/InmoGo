package com.inmogo.api.Entity;
import jakarta.persistence.Entity;
import jakarta.persistence.*;
@Entity
@DiscriminatorValue("Acquirer")

/**
 * Clase que representa a un usuario Adquiriente.
 * 
 * La clase {@code Acquirer} hereda de {@link UserTemplate} y se utiliza para representar a los usuarios
 * que tienen el rol de Adquiriente en el sistema. Un Adquiriente tiene un rol específico asignado
 * (en este caso, el rol 4).
 * 
 * @see UserTemplate
 */

public class Acquirer extends UserTemplate {
    /**
     * Constructor que inicializa un Adquiriente con los detalles proporcionados.
     * Este constructor llama al constructor de la superclase {@link UserTemplate} y establece el rol 
     * del usuario a 4, que representa el rol de Adquiriente.
     * 
     * @param id Identificador del usuario adquiriente.
     * @param name Nombre del usuario adquiriente.
     * @param rut Rut del usuario adquiriente.
     * @param email Correo electrónico del usuario adquiriente.
     * @param password Constraseña del usuario adquiriente.
     */
    public Acquirer(long id, String name, String rut, String email, String password) {
        super(id, name, rut, email, password, 4);
    }

    /**
     * Constructor predeterminado que inicializa un Adquiriente con valores por defecto.
     * 
     * Este constructor llama al constructor predeterminado de la superclase {@link UserTemplate} y establece
     * el rol del usuario a 4, que representa el rol de Adquiriente.
     */
    public Acquirer() {
        super();
        this.setRole(4); 

    }
}
