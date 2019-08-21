package com.db.studies.w1d2.lab1;

import java.util.List;

public class ListUtil<T> {
    public static <T> int countDuplicate(T t, List<T> list, Equalator<T> equalator) {
        int counter = 0;
        for (T t1 : list) {
            if (equalator.equals(t1, t)) {
                counter++;
            }
        }
        return counter;
    }
}

