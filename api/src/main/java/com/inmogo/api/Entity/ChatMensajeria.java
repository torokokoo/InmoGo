package com.inmogo.api.Entity;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.ArrayList;

@Entity
@Table(name = "ChatMensajeria")

public class ChatMensajeria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //atributos
    private long IdChat;
    private Usuario UsuarioRec;
    private Usuario UsuarioEmi;
    private ArrayList<String> HistorialMsm;
    private Timestamp FechaMsm;

    //constructor
    public ChatMensajeria(long idChat, Usuario usuarioRec, Usuario usuarioEmi, ArrayList<String> historialMsm, Timestamp fechaMsm) {
        IdChat = idChat;
        UsuarioRec = usuarioRec;
        UsuarioEmi = usuarioEmi;
        HistorialMsm = historialMsm;
        FechaMsm = fechaMsm;
    }

    //getters y setters

    public long getIdChat() { return IdChat; }

    public void setIdChat(long idChat) { IdChat = idChat; }

    public Usuario getUsuarioRec() { return UsuarioRec; }

    public void setUsuarioRec(Usuario usuarioRec) { UsuarioRec = usuarioRec; }

    public ArrayList<String> getHistorialMsm() { return HistorialMsm; }

    public void setHistorialMsm(ArrayList<String> historialMsm) { HistorialMsm = historialMsm; }

    public Usuario getUsuarioEmi() { return UsuarioEmi; }

    public void setUsuarioEmi(Usuario usuarioEmi) { UsuarioEmi = usuarioEmi; }

    public Timestamp getFechaMsm() { return FechaMsm; }

    public void setFechaMsm(Timestamp fechaMsm) { FechaMsm = fechaMsm; }

    //metodos

    //tengo que analizar a profundidad esto
}
