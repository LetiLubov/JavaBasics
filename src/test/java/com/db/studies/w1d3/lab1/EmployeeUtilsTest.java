package com.db.studies.w1d3.lab1;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;


/**
 * @author Liubov Ruzanova
 */
public class EmployeeUtilsTest {

    @Test
    public void getMapBySeniority() {
        List<Employee> employees = Arrays.asList(
                Employee.builder().salary(120_000).name("sdf").build(),
                Employee.builder().salary(100_002).name("sdf").build()
                );
        EmployeeUtils.getMapBySeniority(employees);
        Assert.assertEquals(EmployeeUtils.getMapBySeniority(employees).get(Seniority.JUNIOR).size(), 2);
    }

    @Test
    public void getSalaryMap() {
        List<Employee> employees = Arrays.asList(
                Employee.builder().salary(120_000).name("sdf").build(),
                Employee.builder().salary(100_002).name("sdf").build()
        );
        System.out.println(EmployeeUtils.getSalaryMap(employees));
    }
}