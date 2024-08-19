package com.inmogo.api.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.sql.Timestamp;

@Entity
@Table(name = "ChatHistory")

public class ChatHistory {
    //atributos
    private String Conversation;
    private String ReceptorRut;
    private Timestamp InitialDate;

    //constructor
    public ChatHistory(String conversation, String receptorRut, Timestamp initialDate) {
        Conversation = conversation;
        ReceptorRut = receptorRut;
        InitialDate = initialDate;
    }

    //getters y setters

    public String getConversation() {
        return Conversation;
    }

    public void setConversation(String conversation) {
        Conversation = conversation;
    }

    public String getReceptorRut() {
        return ReceptorRut;
    }

    public void setReceptorRut(String receptorRut) {
        ReceptorRut = receptorRut;
    }

    public Timestamp getInitialDate() {
        return InitialDate;
    }

    public void setInitialDate(Timestamp initialDate) {
        InitialDate = initialDate;
    }

    //metodos
    public void printConversation(){
        System.out.printf("\n" + getConversation() + "\n");
    }
}