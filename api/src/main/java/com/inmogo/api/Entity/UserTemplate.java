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
    private String role; //Rol, TIPOS de rol 0(Admin), 1(Mod), 2(Propietario), 3(Adquiriente), este se asigna directo en la clase
    private String permission; //Permisos
    //private ArrayList<ChatHistory> chatHistory;

    //Constructor
    public UserTemplate(long id, String name, String rut, String email, String password, String role, String permission) {
        this.id = id;
        this.name = name;
        this.rut = rut;
        this.email = email;
        this.password = password;
        this.role = role;
        this.permission = permission;
        //this.chatHistory = chatHistory
    }

    public UserTemplate() {

    }
/*
    //Default
    public UserTemplate() {
        this.id = 0;
        this.name = "Default";
        this.rut = "123456789";
        this.email = "example@example.com";
        this.password = "1234";
        this.role = "UserTemplate";
        this.permission = "UserTemplate";
        //this.chatHistory = new ArrayList<ChatHistory>();
    }

 */

    //Getters
    public long getId() { return id; }
    public String getName() { return name; }
    public String getRut() { return rut; }
    public String getEmail() { return email; }
    public String getPassword() { return password; }
    public String getRole() { return role; } //ConseguirRol
    public String getPermission() { return permission; } //ConseguirPermiso
    //public ArrayList<ChatHistory> getChatHistory() { return chatHistory; }

    //Setters
    public void setId(long id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setRut(String rut) { this.rut = rut; }
    public void setEmail(String email) { this.email = email; }
    public void setPassword(String password) { this.password = password; }
    public void setRole(String role) { this.role = role; }
    public void setPermission(String permission) { this.permission = permission; }
    //public void setChatHistory(ArrayList<ChatHistory> chatHistory) { this.chatHistory = chatHistory; }


}
