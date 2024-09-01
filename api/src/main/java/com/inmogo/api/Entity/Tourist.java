package com.inmogo.api.Entity;

/**
 * Clase que representa a un Visitante en el sistema.
 * 
 * La clase {@code Tourist} extiende {@link UserTemplate} y se utiliza para representar a los usuarios
 * que tienen el rol de Visitante. Esta clase está anotada con {@code @Entity} para que JPA la maneje
 * como una entidad en la base de datos.
 * 
 * @see UserTemplate
 */

public class Tourist extends UserTemplate{
    /**
     * Constructor que inicializa un usuario visitante con el identificador proporcionado.
     * Este constructor llama al constructor de la superclase {@link UserTemplate} y establece el rol
     * del usuario a 0, que representa el rol de Visitante. Los demás atributos se inicializan en {@code null}.
     * 
     * @param id Identificador del usuario visitante.
     */
    public Tourist(long id) {
        super(id, null, null, null, null, 0);
    }

    /**
     * Constructor predeterminado que inicializa un usuario visitante con valores por defecto.
     * Este constructor llama al constructor predeterminado de la superclase {@link UserTemplate} y establece
     * el rol del usuario a 0, que representa el rol de Visitante.
     */
    public Tourist(){
        super();
        this.setRole(0); 
    }
}
