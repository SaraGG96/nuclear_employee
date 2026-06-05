package com.springfield.powerplant.model;
 import java.util.Optional;

public final class Employee {

    private String name;
    private final Optional<Integer> id;
    private Department department;
    private ExperienceLevel experienceLevel;
    private Shift shift;

    public Employee(String name, Integer id, Department department, ExperienceLevel experienceLevel, Shift shift) {
        this.name = name;
        this.id = Optional.ofNullable(id);
        this.department = department;
        this.experienceLevel = experienceLevel;
        this.shift = shift;
    }

    public String getName() {
        return this.name;
    }

    public Integer getId() {
        return this.id.orElse(null);
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
    return "Nombre: " + getName() + " | " + "( ID: " + getId() + " | " + "Nivel: " + getExperienceLevel() + " | " + "Turno: " + getShift().getNombreEspanol() + " )";
    }
     
}
