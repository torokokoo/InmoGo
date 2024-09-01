package com.inmogo.api.Entity;

import jakarta.persistence.*;

/**
 * La clase UserTemplate sirve como plantilla para la creación de usuarios en el sistema.
 * Contiene los atributos comunes a todos los tipos de usuarios, como ID, nombre, RUT, correo electrónico,
 * contraseña y rol. Esta clase proporciona un constructor por defecto y uno parametrizado para la creación
 * de instancias de usuarios, así como métodos para acceder y modificar los atributos.
 * 
 * Atributos principales:
 * - id: Identificador único del usuario, auto-incremental.
 * - name: Nombre del usuario.
 * - rut: RUT del usuario.
 * - email: Correo electrónico del usuario.
 * - password: Contraseña del usuario.
 * - role: Rol del usuario en el sistema, donde 0 es Visitante, 1 es Administrador, 2 es Mantenedor,
 * 3 es Propietario, y 4 es Adquiriente.
 * 
 * El rol predeterminado es 4 (Adquiriente) si no se especifica un valor diferente.
 * 
 * Métodos incluidos:
 * - Constructores para crear instancias con y sin parámetros.
 * - Getters para acceder a los atributos del usuario.
 * - Setters para modificar los atributos del usuario.
 * 
 * Esta clase puede ser extendida para crear tipos específicos de usuarios en el sistema.
 */

@Entity //Se indica a la base de datos que es la Entidad donde se encuentran todos los atributos y genere tabla
@Table(name = "UserTemplate") //Nombre dentro de la base de desatos
@Inheritance(strategy = InheritanceType.SINGLE_TABLE) //Indica que todas las clases heradas de esta clase, en la base de datos se almacena en una sola tabla UserTemplate
@DiscriminatorColumn(name = "user_type", discriminatorType = DiscriminatorType.STRING)//La comuna donde el base de datos se pueden encontrar los diversos user

//Se crea la clase del Usuario planilla que servira como molde para los demas users
public class UserTemplate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //Attributes
    private long id; 
    private String name;
    private String rut; 
    private String email; 
    private String password; 
    private Integer role; 

    //Constructor

    /**
     * Constructor parametrizado para crear una instancia de UserTemplate.
     *
     * @param id Identificador único del usuario. Es auto-incremental y no debe ser rellenado manualmente.
     * @param name Nombre del usuario.
     * @param rut RUT del usuario.
     * @param email Correo electrónico del usuario.
     * @param password Contraseña del usuario.
     * @param role Rol del usuario. siendo 0:Visitante, 1:Adminstrador, 2:Mantenedor, 3:Propietario, 4:Adquiriente
     */
    public UserTemplate(long id, String name, String rut, String email, String password, Integer role) {
        this.id = id;
        this.name = name;
        this.rut = rut;
        this.email = email;
        this.password = password;
        this.role = role != null ? role : 4; 
    }

    /**
     * Constructor por defecto para crear una instancia de UserTemplate con el rol predeterminado de 4 (Adquiriente).
     */
    public UserTemplate() {
        this.role = 4; 
    }


    //Getters

    /**
     * Obtiene el identificador único del usuario.
     *
     * @return Identificador del usuario.
     */
    public long getId() { return id; }

    /**
     * Obtiene el nombre del usuario.
     *
     * @return Nombre de usuario
     */
    public String getName() { return name; }

    /**
     * Obtiene el RUT del usuario.
     *
     * @return RUT del usuario.
     */
    public String getRut() { return rut; }

    /**
     * Obtiene el correo electrónico del usuario en el sistema.
     *
     * @return Correo electrónico del usuario.
     */
    public String getEmail() { return email; }

    /**
     * Obtiene la contraseña del usuario en el sistema.
     *
     * @return Contraseña del usuario 
     */
    public String getPassword() { return password; }

    /**
     * Obtiene el rol del usuario en el sistema.
     * 
     * @return Rol de usuario.
     */
    public Integer getRole() { return role; } //ConseguirRol

    //Setters

    /**
     * Modifica el id del usuario.
     *
     * @param id Nuevo id de usuario.
     */
    public void setId(long id) { this.id = id; }

    /**
     * Modifica el nombre del usuario.
     *
     * @param name Nombre del usuario
     */
    public void setName(String name) { this.name = name; }

    /**
     * Modifica el RUT del usuario en el sistema.
     *
     * @param rut Nuevo RUT de usuario.
     */
    public void setRut(String rut) { this.rut = rut; }

    /**
     * Modifica el correo electrónico del usuario en el sistema.
     *
     * @param email Nuevo correo electrónico del usuario
     */
    public void setEmail(String email) { this.email = email; }

    /**
     * Modifica la constraseña del usuario en el sistema.
     *
     * @param password Nueva contraseña del usuario.
     */
    public void setPassword(String password) { this.password = password; }

    /**
     * Modifica el rol del usuario en el sistema.
     *
     * @param role Nuevo rol del usuario.
     */
    public void setRole(Integer role) { this.role = role; }

}
