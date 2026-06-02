package com.springfield.powerplant.model;

public final class Employee {

    private String name;
    private int id;
    private Department department;
    private ExperienceLevel experienceLevel;
    private Shift shift;

    public Employee(String name, int id, Department department, ExperienceLevel experienceLevel, Shift shift) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.experienceLevel = experienceLevel;
        this.shift = shift;
    }

    public String getName() {
        return this.name;
    }

    public int getId() {
        return this.id;
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

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void setExperienceLevel(ExperienceLevel experienceLevel) {
        this.experienceLevel = experienceLevel;
    }

    public void setShift(Shift shift) {
        this.shift = shift;
    }
    
     @Override
     public String toString() {
        return "Nombre: " + this.name + "\n" + "ID: " + this.id + "\n" + "Nivel: " + this.experienceLevel + "\n" + "Turno: " + this.shift + "\n";
     }
     
}
