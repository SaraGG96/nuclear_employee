package com.springfield.powerplant.model;

public enum Department {
    
    REACTOR_CONTROL("CONTROL DE REACTOR"), 
    SECURITY("SEGURIDAD"), 
    MAINTENANCE("MANTENIMIENTO"), 
    ADMINISTRATION("ADMINISTRACION");

    private final String nombreEsp;

    private Department (String nombreEsp) {
        this.nombreEsp = nombreEsp;
    }

    public String getNombreEspanol() {
        return this.nombreEsp;
    }

}
