package com.inmogo.api.Entity;

import jakarta.persistence.*;
import java.util.LinkedList;
import java.util.List;

/**
 * Representa el Historial de Chats de un usuario.
 * Organiza a un grupo de usuarios con los que un usuario principal ha interactuado.
 */

@Entity
@Table(name = "ChatHistory")
public class ChatHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne
    private UserTemplate userOwner;

    @ManyToMany
    private List<UserTemplate> contacts = new LinkedList<>();

    //Constructors
    public ChatHistory(long id, UserTemplate userOwner, List<UserTemplate> contacts) {
        this.id = id;
        this.userOwner = userOwner;
        this.contacts = contacts;
    }

    public ChatHistory(){}

    //Getters
    public long getId() { return id; }
    public UserTemplate getUserOwner() { return userOwner; }
    public List<UserTemplate> getContacts() { return contacts; }

    //Setters
    public void setId(long id) { this.id = id; }
    public void setUserOwner(UserTemplate userOwner) { this.userOwner = userOwner; }
    public void setContacts(List<UserTemplate> contacts) { this.contacts = contacts; }

    //Otros Metodos

    /**
     * Asigna a un usuario especifico al tope de la lista de contactos.
     * Si este esta en la lista, lo mueve.
     * Si este no esta en la lista, lo agrega y lo mueve.
     * @param contact El Usuario al que asigna al tope.
     */
    public void updateContactPosition(UserTemplate contact){
        if (contacts.contains(contact)){
            //Existe, entonces lo remueve para moverlo.
            contacts.remove(contact);
        }
        contacts.add(contact);
    }
}