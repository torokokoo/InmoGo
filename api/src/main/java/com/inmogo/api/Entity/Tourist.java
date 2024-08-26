package com.inmogo.api.Entity;

public class Tourist extends UserTemplate{
    public Tourist(long id) {
        super(id, null, null, null, null, 0);
    }

    public Tourist(){
        super();
        this.setRole(0); // Establece el rol a 0 (Visitante)
    }
}
