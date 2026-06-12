package com.springfield.powerplant.service.impl;

import org.junit.Before;
import org.junit.Test;

import com.springfield.powerplant.model.Department;
import com.springfield.powerplant.model.Employee;
import com.springfield.powerplant.model.ExperienceLevel;
import com.springfield.powerplant.model.Shift;

public class EmployeeManagementServiceImplTest {

    private EmployeeManagementServiceImpl employeeService;
    private Employee homer;
    private Employee lenny;
    private Employee carl;
    private Employee smithers;

    @Before
    public void setUp() {
        employeeService = new EmployeeManagementServiceImpl();
        homer = employeeService.createEmployee("Homer Simpson", 1, Department.REACTOR_CONTROL, ExperienceLevel.NOVATO, Shift.MORNING);
        lenny = employeeService.createEmployee("Lenny Leonard", 2, Department.SECURITY, ExperienceLevel.INTERMEDIO, Shift.AFTERNOON);
        carl = employeeService.createEmployee("Carl Carlson", 3, Department.MAINTENANCE, ExperienceLevel.INTERMEDIO, Shift.NIGHT);
        smithers = employeeService.createEmployee("Smithers", 4, Department.ADMINISTRATION, ExperienceLevel.EXPERTO, Shift.MORNING);
    }


    @Test
    public void testChangeEmployeeExperienceLevel() {
        employeeService.changeEmployeeExperienceLevel(homer, ExperienceLevel.EXPERTO);
        assert(homer.getExperienceLevel() == ExperienceLevel.EXPERTO);
    }

    @Test
    public void testCreateEmployee() {
        Employee newEmployee = employeeService.createEmployee("Apu Nahasapeemapetilon", 5, Department.SECURITY, ExperienceLevel.INTERMEDIO, Shift.AFTERNOON);
        assert(newEmployee.getName().equals("Apu Nahasapeemapetilon"));
        assert(newEmployee.getId() == 5);
        assert(newEmployee.getDepartment() == Department.SECURITY);
        assert(newEmployee.getExperienceLevel() == ExperienceLevel.INTERMEDIO);
        assert(newEmployee.getShift() == Shift.AFTERNOON);
    }

    @Test
    public void testCrewSize() {
        assert(employeeService.crewSize() == 4);
    }

    @Test
    public void testFindEmployeesByDepartment() {
        assert(employeeService.findEmployeesByDepartment(Department.REACTOR_CONTROL).size() == 1);
        assert(employeeService.findEmployeesByDepartment(Department.SECURITY).size() == 1);
        assert(employeeService.findEmployeesByDepartment(Department.MAINTENANCE).size() == 1);
        assert(employeeService.findEmployeesByDepartment(Department.ADMINISTRATION).size() == 1);
    }

    @Test
    public void testGetEmployees() {
        assert(employeeService.getEmployees().size() == 4);
        assert(employeeService.getEmployees().contains(homer));
        assert(employeeService.getEmployees().contains(lenny));
        assert(employeeService.getEmployees().contains(carl));
        assert(employeeService.getEmployees().contains(smithers));
    }

    @Test
    public void testGetExperienceLevelStatistics() {
        var stats = employeeService.getExperienceLevelStatistics();
        assert(stats.get("Novato") == 1L);
        assert(stats.get("Intermedio") == 2L);
        assert(stats.get("Experto") == 1L);
    }

    @Test
    public void testIsDepartmentFullyCovered() {
        assert(employeeService.isDepartmentFullyCovered(Department.REACTOR_CONTROL) == false);
        assert(employeeService.isDepartmentFullyCovered(Department.SECURITY) == false);
        assert(employeeService.isDepartmentFullyCovered(Department.MAINTENANCE) == false);
        assert(employeeService.isDepartmentFullyCovered(Department.ADMINISTRATION) == false);
    }
}
