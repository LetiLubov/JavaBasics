package com.db.studies.w1d3.lab1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author Liubov Ruzanova
 */
public class EmployeeUtils {
    public static Map<Seniority, List<Employee>> getMapBySeniority(List<Employee> employees) {
        return employees.stream()
                .collect(Collectors.groupingBy(emp -> Arrays.stream(Seniority.values())
                        .filter(x -> x.minSalary <= emp.getSalary())
                        .filter(x -> x.maxSalary >= emp.getSalary())
                        .findFirst()
                        .orElseThrow(() -> new IllegalArgumentException("bad case"))));
    }

    public static Map<String, Integer> getSalaryMap(List<Employee> employees) {
       return employees.stream()
               .collect(Collectors
                       .toMap(Employee::getName, Employee::getSalary, (x, y) -> x));
    }
}
