package com.inmogo.api.Entity;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.ArrayList;

@Entity
@Table(name = "ChatPost")

public class ChatPost {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //atributos
    private long IdChat;
    private User UserReceptor;
    private User UserTransmitter;
    private ArrayList<String> MsmHistory;
    private Timestamp MsmDate;

    //constructor
    public ChatPost(long idChat, User userReceptor, User userTrans, ArrayList<String> MessageHistory, Timestamp MsmDates) {
        IdChat = idChat;
        UserReceptor = userReceptor;
        UserTransmitter = userTrans;
        MsmHistory = MessageHistory;
        MsmDate = MsmDates;
    }

    //getters y setters

    public long getIdChat() { return IdChat; }

    public void setIdChat(long idChat) { IdChat = idChat; }

    public User getUserReceptor() { return UserReceptor; }

    public void setUserReceptor(User UserRec) { UserReceptor = UserRec; }

    public ArrayList<String> getMsmHistory() { return MsmHistory; }

    public void setMsmHistory(ArrayList<String> MsmHist) { MsmHistory = MsmHist; }

    public User getUserTransmitter() { return UserTransmitter; }

    public void setUserTransmitter(User userTrans) { UserTransmitter = userTrans; }

    public Timestamp getMsmDate() { return MsmDate; }

    public void setMsmDate(Timestamp dateMessage) { MsmDate = dateMessage; }

    //metodos

    //tengo que analizar a profundidad esto
}