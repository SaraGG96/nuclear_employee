package com.springfield.powerplant.service;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.springfield.powerplant.model.Department;
import com.springfield.powerplant.model.Employee;
import com.springfield.powerplant.model.ExperienceLevel;
import com.springfield.powerplant.model.Shift;

public class EmployeeManagementService {

    private ArrayList<Employee> employees = new ArrayList<Employee>();


    public Employee createEmployee(String name, int id, Department department, ExperienceLevel experienceLevel, Shift shift) {
        Employee employee = new Employee(name, id, department, experienceLevel, shift);
        // parámetros empleado
        employee.setName(name);
        employee.setId(id);
        employee.setDepartment(department);
        employee.setExperienceLevel(experienceLevel);
        employee.setShift(shift);
        // lo metes en la lista
        employees.add(employee);
        return employee;
    }

    public void listCrew() {
        for (var employee : this.employees) {
            System.out.println(
            "Nombre: " + employee.getName() + " | " +
            "ID: " + employee.getId() + " | " +
            "Departamento: " + employee.getDepartment() + " | " +
            "Nivel: " + employee.getExperienceLevel() + " | " +
            "Turno: " + employee.getShift()
            );
        }
    }

    public int crewSize() {
        return this.employees.size();
    }

    public List<Employee> findEmployeesByDepartment(Department targetDepartament) {
        ArrayList<Employee> empleadosReactor = new ArrayList<Employee>();
        for (var employee : this.employees) {
            if (employee.getDepartment() == targetDepartament) {
                empleadosReactor.add(employee);
            }
        }
        return empleadosReactor;
    }

    public void changeEmployeeExperienceLevel(Employee targetEmployee, ExperienceLevel targetLevel) {
        for (var employee : this.employees) {
            if (employee.getName() == targetEmployee.getName()) {
                employee.setExperienceLevel(targetLevel);
            }
        }
    }

    public Map<String, Long> getExperienceLevelStatistics() {

        Long novatoCount = 0l;
        Long intermedioCount = 0l;
        Long expertoCount = 0l;
        
        for (var employee : this.employees) {


            if (employee.getExperienceLevel() == ExperienceLevel.NOVATO) {
                novatoCount += 1;
            } if (employee.getExperienceLevel() == ExperienceLevel.INTERMEDIO) {
                intermedioCount += 1;
            } else {
                expertoCount += 1;
            }
        }

        HashMap<String, Long> stats = new HashMap<String, Long>();
        stats.put("Novato", novatoCount);
        stats.put("Intermediario", intermedioCount);
        stats.put("Experto", expertoCount);
        return stats;

    }


    public boolean isDepartmentFullyCovered(Department targetDepartment) {

        boolean isCovered = false;

        for (var employee : this.employees) {
            if (employee.getDepartment() == targetDepartment) {
                isCovered = true;
            } else {
                isCovered = false;
            }
        }
        return isCovered;
    }



    
}
