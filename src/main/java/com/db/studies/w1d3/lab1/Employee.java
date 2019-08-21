package com.db.studies.w1d3.lab1;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Employee {
    private String name;
    private int salary;
}
