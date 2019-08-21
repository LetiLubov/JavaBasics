package com.db.studies.w1d3.lab1;

import lombok.Data;

/**
 * @author Liubov Ruzanova
 */
public enum Seniority {
    JUNIOR(10_000, 200_000),
    MIDDLE(200_001, 400_000),
    SENIOR(400_001, 600_000);

    public final int minSalary;
    public final int maxSalary;

    Seniority(int minSalary, int maxSalary) {
        this.minSalary = minSalary;
        this.maxSalary = maxSalary;
    }

//    public static Seniority getSeniorityBySalary(int salary){
//        for (Seniority value : Seniority.values()) {
//            if (value.minSalary <= salary && value.maxSalary >= salary){
//                return value;
//            }
//        }
//        throw new IllegalArgumentException("don't have this salary instructions");
//    }
}
