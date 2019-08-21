package com.db.studies.design_patterns.switch_refactor;

import java.util.Random;

/**
 * @author Liubov Ruzanova
 */
public class DBUtils {
    private static Random random = new Random();
    public static int getMailCode() {
        return random.nextInt(2) + 1;
    }
}
