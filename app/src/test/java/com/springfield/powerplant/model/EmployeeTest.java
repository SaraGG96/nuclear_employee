package com.springfield.powerplant.model;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EmployeeTest {

    Employee manolo = new Employee("Manolo", 5, Department.REACTOR_CONTROL, ExperienceLevel.NOVATO, Shift.AFTERNOON);

    @Test
    public void testGetDepartment() {
        assertEquals(manolo.getDepartment(), Department.REACTOR_CONTROL);
    }

    @Test
    public void testGetExperienceLevel() {
        assertEquals(manolo.getExperienceLevel(), ExperienceLevel.NOVATO);
    }

    @Test
    public void testGetId() {
        assertEquals(manolo.getId(), 5);
    }

    @Test
    public void testGetName() {
        assertEquals(manolo.getName(), "Manolo");
    }

    @Test
    public void testGetShift() {
      assertEquals(manolo.getShift(), Shift.AFTERNOON);
    }

}
