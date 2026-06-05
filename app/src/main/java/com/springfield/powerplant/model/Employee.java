package com.springfield.powerplant.model;
import java.util.Objects;
import java.util.Optional;

public final class Employee {

    private String name;
    private Integer id;
    private Department department;
    private ExperienceLevel experienceLevel;
    private Shift shift;

    public Employee(String name, Integer id, Department department, ExperienceLevel experienceLevel, Shift shift) {
        this.name = name;
        this.id = Objects.requireNonNull(id, "No puede ser null");
        this.department = department;
        this.experienceLevel = experienceLevel;
        this.shift = shift;
    }

    public String getName() {
        return this.name;
    }

    public Optional<Integer> getId() {
        return Optional.ofNullable(id);
    }

    public Department getDepartment() {
        return this.department;
    }

    public ExperienceLevel getExperienceLevel() {
        return this.experienceLevel;
    }

    public Shift getShift() {
        return this.shift;
    }

    public void setExperienceLevel(ExperienceLevel experienceLevel) {
        this.experienceLevel = experienceLevel;
    }


    
     @Override
     public String toString() {
        return "( Nombre: " + this.name + " | " + "ID: " + this.id + " | " + "Nivel: " + this.experienceLevel.name() + " | " + "Turno: " + this.shift.getNombreEspanol() + " )";
     }
     
}
