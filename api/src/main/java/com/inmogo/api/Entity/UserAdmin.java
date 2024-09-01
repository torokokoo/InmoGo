package com.inmogo.api.Entity;
import jakarta.persistence.Entity;
import jakarta.persistence.*;


/**
 * Clase que representa a un Administrador del sistema.
 * 
 * La clase {@code UserAdmin} hereda de {@link UserTemplate} y se utiliza para representar a los usuarios
 * que tienen el rol de Administrador en el sistema. Un Administrador tiene un rol específico asignado
 * (en este caso, el rol 1). Esta clase está anotada como una entidad en JPA.
 * 
 * @see UserTemplate
 */

@Entity
@DiscriminatorValue("Admin")

public class UserAdmin extends UserTemplate {
    //Constructor

    /**
     * Constructor que inicializa un Administrador con los detalles proporcionados.
     * Este constructor llama al constructor de la superclase {@link UserTemplate} y establece el rol
     * del usuario a 1, que representa el rol de Administrador.
     * 
     * @param id Identificador del usuario administrador.
     * @param name Nombre del usuario administrador.
     * @param rut RUT del usuario administrador.
     * @param email Correo electrónico del usuario administrador.
     * @param password Contraseña del usuario administrador.
     */
    public UserAdmin(long id, String name, String rut, String email, String password) {
        super(id, name, rut, email, password, 1);
    }

    /**
     * Constructor predeterminado que inicializa un Administrador con valores por defecto.
     * Este constructor llama al constructor predeterminado de la superclase {@link UserTemplate} y establece
     * el rol del usuario a 1, que representa el rol de Administrador.
     */
    public UserAdmin(){
        super();
        this.setRole(1); // Establece el rol a 1 (Administrador)
    }

}
