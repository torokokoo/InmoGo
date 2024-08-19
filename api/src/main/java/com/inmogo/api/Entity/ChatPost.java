package com.inmogo.api.Entity;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.ArrayList;

@Entity
@Table(name = "ChatPost")

public class ChatPost{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //atributos
    private long IdChat;
    private UserTemplate UserReceptor;
    private UserTemplate UserTransmitter;
    private ArrayList<String> MsmHistory;
    private Timestamp MsmDate;

    //constructor
    public ChatPost(long idChat, UserTemplate userReceptor, UserTemplate userTrans, ArrayList<String> MessageHistory, Timestamp MsmDates) {
        IdChat = idChat;
        UserReceptor = userReceptor;
        UserTransmitter = userTrans;
        MsmHistory = MessageHistory;
        MsmDate = MsmDates;
    }

    //getters y setters

    public long getIdChat() { return IdChat; }

    public void setIdChat(long idChat) { IdChat = idChat; }

    public UserTemplate getUserReceptor() { return UserReceptor; }

    public void setUserReceptor(UserTemplate UserRec) { UserReceptor = UserRec; }

    public ArrayList<String> getMsmHistory() { return MsmHistory; }

    public void setMsmHistory(ArrayList<String> MsmHist) { MsmHistory = MsmHist; }

    public UserTemplate getUserTransmitter() { return UserTransmitter; }

    public void setUserTransmitter(UserTemplate userTrans) { UserTransmitter = userTrans; }

    public Timestamp getMsmDate() { return MsmDate; }

    public void setMsmDate(Timestamp dateMessage) { MsmDate = dateMessage; }

    //metodos

    //tengo que analizar a profundidad esto
}