package com.springfield.powerplant.service;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;
import com.springfield.powerplant.model.Department;
import com.springfield.powerplant.model.Employee;
import com.springfield.powerplant.model.ExperienceLevel;
import com.springfield.powerplant.model.Shift;


public class EmployeeManagementServiceTest {

    EmployeeManagementService employeeService = new EmployeeManagementService();

    Employee homer = employeeService.createEmployee("Homer Simpson", 1, Department.REACTOR_CONTROL, ExperienceLevel.NOVATO, Shift.MORNING);
    Employee lenny = employeeService.createEmployee("Lenny Leonard", 2, Department.SECURITY, ExperienceLevel.INTERMEDIO, Shift.AFTERNOON);
    Employee carl = employeeService.createEmployee("Carl Carlson", 3, Department.MAINTENANCE, ExperienceLevel.INTERMEDIO, Shift.NIGHT);
    Employee smithers = employeeService.createEmployee("Smithers", 4, Department.ADMINISTRATION, ExperienceLevel.EXPERTO, Shift.MORNING);

    @Test
    public void testChangeEmployeeExperienceLevel() {
        employeeService.changeEmployeeExperienceLevel(homer, ExperienceLevel.EXPERTO);
        assertEquals(homer.getExperienceLevel(), ExperienceLevel.EXPERTO);
    }

    @Test
    public void testCrewSize() {
        assertEquals(employeeService.crewSize(), 4);
    }

}
