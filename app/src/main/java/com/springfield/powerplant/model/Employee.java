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
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Employee other = (Employee) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }
    
    @Override
    public String toString() {
    return "Nombre: " + getName() + " | " + "( ID: " + getId() + " | " + "Nivel: " + getExperienceLevel() + " | " + "Turno: " + getShift().getNombreEspanol() + " )";
    }
     
}
