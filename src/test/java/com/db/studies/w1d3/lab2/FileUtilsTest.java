package com.db.studies.w1d3.lab2;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Liubov Ruzanova
 */
public class FileUtilsTest {
    private static String fileName = "src\\test\\java\\com\\db\\studies\\w1d3\\lab2\\test.txt";
    private static String fileName2 = "src\\test\\java\\com\\db\\studies\\w1d3\\lab2\\test2.txt";

    @Test
    public void countWordsInFile() {
        Assert.assertEquals(10, FileUtils.countWordsInFile(fileName));
    }

    @Test
    public void countAverageWordsLengthInFile() {
        Assert.assertEquals(3.2, FileUtils.countAverageWordsLengthInFile(fileName).getAsDouble(), 0.0005);
    }

    @Test
    public void countAverageWordsLengthInFile2() {
        Assert.assertEquals(4, FileUtils.countAverageWordsLengthInFile(fileName2).getAsDouble(), 0.0005);
    }
}