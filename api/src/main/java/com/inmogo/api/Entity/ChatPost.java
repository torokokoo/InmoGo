package com.inmogo.api.Entity;

import jakarta.persistence.*;
import java.sql.Timestamp;

/**
 * Representa el mensaje que un usuario ha hecho a otro.
 */

@Entity
@Table(name = "ChatPost")
public class ChatPost{
    //Attrib
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(nullable = false)
    private UserTemplate emitter;

    @ManyToOne
    @JoinColumn(nullable = false)
    private UserTemplate receiver;

    private String message;
    private Timestamp msgTimestamp;

    //Constructor
    public ChatPost(long id, UserTemplate emitter, UserTemplate receiver, String message, Timestamp msgTimestamp) {
        this.id = id;
        this.emitter = emitter;
        this.receiver = receiver;
        this.message = message;
        this.msgTimestamp = msgTimestamp;
    }
    //Default
    public ChatPost(){}

    //Getters
    public long getId() { return id; }
    public UserTemplate getEmitter() { return emitter; }
    public UserTemplate getReceiver() { return receiver; }
    public String getMessage() { return message; }
    public Timestamp getMsgTimestamp() { return msgTimestamp; }

    //Setters
    public void setId(long id) { this.id = id; }
    public void setEmitter(UserTemplate emitter) { this.emitter = emitter; }
    public void setReceiver(UserTemplate receiver) { this.receiver = receiver; }
    public void setMessage(String message) { this.message = message; }
    public void setMsgTimestamp(Timestamp msgTimestamp) { this.msgTimestamp = msgTimestamp; }
}