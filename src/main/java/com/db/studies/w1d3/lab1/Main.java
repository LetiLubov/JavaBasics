package com.db.studies.w1d3.lab1;

import java.util.ArrayList;

/**
 * @author Liubov Ruzanova
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("dd", 12));
        employees.add(new Employee("dd", 122));
        int sum = employees
                .stream()
                .mapToInt(Employee::getSalary)
                .sum();
        sum = employees.stream()
                .mapToInt(Employee::getSalary)
                .reduce(0, Integer::sum);
        System.out.println(sum);
    }
}
