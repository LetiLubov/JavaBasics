package com.db.studies.w1d2.lab2;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3);

        LambdaUtils.forEachWithDelay(list, 200, System.out::println);
    }
}
