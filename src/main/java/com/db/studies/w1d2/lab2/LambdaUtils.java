package com.db.studies.w1d2.lab2;

import lombok.SneakyThrows;

import java.util.List;
import java.util.function.Consumer;

public class LambdaUtils<T> {
    @SneakyThrows
    public static <T> void forEachWithDelay(List<T> list, int delay, Consumer<T> consumer) {
        for (T item : list) {
            consumer.accept(item);
            Thread.sleep(delay);
        }
    }
}
