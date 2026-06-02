package com.springfield.powerplant.service;
import java.util.List;
import java.util.Map;

import com.springfield.powerplant.model.Department;
import com.springfield.powerplant.model.Employee;
import com.springfield.powerplant.model.ExperienceLevel;
import com.springfield.powerplant.model.Shift;

public interface EmployeeManagementService {

    Employee createEmployee(String name, int id, Department department, ExperienceLevel experienceLevel, Shift shift);
    void listCrew();
    int crewSize();
    List<Employee> findEmployeesByDepartment(Department targetDepartament);
    void changeEmployeeExperienceLevel(Employee targetEmployee, ExperienceLevel targetLevel);
    Map<String, Long> getExperienceLevelStatistics();
    boolean isDepartmentFullyCovered(Department targetDepartment);

}
