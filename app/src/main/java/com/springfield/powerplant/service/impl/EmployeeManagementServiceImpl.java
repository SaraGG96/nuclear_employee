package com.springfield.powerplant.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.springfield.powerplant.model.Department;
import com.springfield.powerplant.model.Employee;
import com.springfield.powerplant.model.ExperienceLevel;
import com.springfield.powerplant.model.Shift;
import com.springfield.powerplant.service.EmployeeManagementService;

public class EmployeeManagementServiceImpl implements EmployeeManagementService {

    private ArrayList<Employee> employees = new ArrayList<Employee>();


    public Employee createEmployee(String name, int id, Department department, ExperienceLevel experienceLevel, Shift shift) {
        Employee employee = new Employee(name, id, department, experienceLevel, shift);
        employees.add(employee);
        displayEmployee(employee);
        return employee;
    }

    public void displayEmployee(Employee employee) {
        System.out.println("Empleado " + employee.getName() + " asignado al departamento: " + employee.getDepartment().getNombreEspanol());
    }

    public List<Employee> getEmployees() {
        return this.employees;
    }

    public void listCrew() {
        getEmployees().forEach(System.out::println);
    }

    public int crewSize() {
        return getEmployees().size();
    }


    public List<Employee> findEmployeesByDepartment(Department targetDepartament) {
        ArrayList<Employee> empleadosReactor = new ArrayList<Employee>();
        for (var employee : getEmployees()) {
            if (employee.getDepartment() == targetDepartament) {
                empleadosReactor.add(employee);
            }
        }
        return empleadosReactor;
    }

    public void changeEmployeeExperienceLevel(Employee targetEmployee, ExperienceLevel targetLevel) {
        for (var employee : getEmployees()) {
            if (employee.getId() == targetEmployee.getId()) {
                employee.setExperienceLevel(targetLevel);
            }
        }
    }

    public Map<String, Long> getExperienceLevelStatistics() {

        long novatoCount = 0L;
        long intermedioCount = 0L;
        long expertoCount = 0L;

        for (var employee : getEmployees()) {

            if (employee.getExperienceLevel() == ExperienceLevel.NOVATO) {
                novatoCount += 1;
            } else if (employee.getExperienceLevel() == ExperienceLevel.INTERMEDIO) {
                intermedioCount += 1;
            } else {
                expertoCount += 1;
            }
        }

        Map<String, Long> stats = new HashMap<String, Long>();
        stats.put("Novato", novatoCount);
        stats.put("Intermedio", intermedioCount);
        stats.put("Experto", expertoCount);
        return stats;

    }


    public boolean isDepartmentFullyCovered(Department targetDepartment) {

        for (Shift shift : Shift.values()) {
            boolean isCovered = false;
            for (var employee : getEmployees()) {
                if (employee.getDepartment() == targetDepartment && employee.getShift() == shift) {
                    isCovered = true;
                    break;
                }
            }
            if (!isCovered) {
                return false;
            }
        }
        return true;

    }



    
}
