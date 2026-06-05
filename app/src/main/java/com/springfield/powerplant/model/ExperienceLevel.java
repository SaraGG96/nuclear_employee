package com.springfield.powerplant.model;

public enum ExperienceLevel {

    NOVATO(1), 
    INTERMEDIO(2), 
    EXPERTO(3);

    private final Integer nivelExp;

    private ExperienceLevel (Integer nivelExp) {
        this.nivelExp = nivelExp;
    }

    public Integer getNivelExp() {
        return this.nivelExp;
    }
 
}
