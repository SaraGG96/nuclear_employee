package com.springfield.powerplant.model;

public enum Shift {
    
    MORNING("MANANA"), 
    AFTERNOON("TARDE"), 
    NIGHT("NOCHE");

    private final String nombreEsp;

    Shift (String nombreEsp) {
        this.nombreEsp = nombreEsp;
    }

    public String getNombreEspanol() {
        return this.nombreEsp;
    }
    
}
