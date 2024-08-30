package com.inmogo.api.Entity;

import jakarta.persistence.*;

@Entity //Se indica a la base de datos que es la Entidad donde se encuentran todos los atributos y genere tabla
@Table(name = "UserTemplate") //Nombre dentro de la base de desatos
@Inheritance(strategy = InheritanceType.SINGLE_TABLE) //Indica que todas las clases heradas de esta clase, en la base de datos se almacena en una sola tabla UserTemplate
@DiscriminatorColumn(name = "user_type", discriminatorType = DiscriminatorType.STRING)//La comuna donde el base de datos se pueden encontrar los diversos user

//Se crea la clase del Usuario planilla que servira como molde para los demas users
public class UserTemplate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //Attributes
    private long id; //ID es auto incremental, no se debe rellenar en los campos
    private String name; //Nombre
    private String rut; //RUT
    private String email; //Correo electronico
    private String password; //Conseña
    private Integer role; //Rol, TIPOS de rol 0(Visitante), 1(Administrador), 2(Mod), 3(Propietario), 4(Adquiriente) este se asigna directo en la clase

    //Constructor
    public UserTemplate(long id, String name, String rut, String email, String password, Integer role) {
        this.id = id;
        this.name = name;
        this.rut = rut;
        this.email = email;
        this.password = password;
        this.role = role != null ? role : 0; // Establece role a 0 (visitante) si no se proporciona
    }

    // Establece role a 0 por defecto
    public UserTemplate() { this.role = 0; }


    //Getters
    public long getId() { return id; }
    public String getName() { return name; }
    public String getRut() { return rut; }
    public String getEmail() { return email; }
    public String getPassword() { return password; }
    public Integer getRole() { return role; } //ConseguirRol

    //Setters
    public void setId(long id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setRut(String rut) { this.rut = rut; }
    public void setEmail(String email) { this.email = email; }
    public void setPassword(String password) { this.password = password; }
    public void setRole(Integer role) { this.role = role; }


}
