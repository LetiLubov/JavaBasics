package com.db.studies.w1d3.lab2;

import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.OptionalDouble;

/**
 * @author Liubov Ruzanova
 */
public class FileUtils {

    @SneakyThrows
    public static int countWordsInFile(String fileName) {
        FileReader reader = new FileReader(fileName);
        BufferedReader br = new BufferedReader(reader);
        return br.lines()
                .mapToInt(x -> x.split(" ").length)
                .sum();
    }

    @SneakyThrows
    public static OptionalDouble countAverageWordsLengthInFile(String fileName) {
        FileReader reader = new FileReader(fileName);
        BufferedReader br = new BufferedReader(reader);
        return br.lines()
                .flatMap(x -> Arrays.stream(x.split(" ")))
                .mapToInt(String::length)
                .average();
    }
}
