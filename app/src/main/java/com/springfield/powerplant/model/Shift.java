package com.springfield.powerplant.model;

public enum Shift {
    
    MORNING("MANANA"), 
    AFTERNOON("TARDE"), 
    NIGHT("NOCHE");

    private final String nombreEsp;

    private Shift (String nombreEsp) {
        this.nombreEsp = nombreEsp;
    }

    String getNombreEspanol() {
        return this.nombreEsp;
    }
    
}
