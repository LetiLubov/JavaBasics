package com.db.studies.design_patterns.switch_refactor;

import lombok.SneakyThrows;

/**
 * @author Liubov Ruzanova
 */
public class Main {

    @SneakyThrows
    public static void main(String[] args) {
        DistributionService distributionService = new DistributionService();
        while (true){
            distributionService.sendMail();
            Thread.sleep(300);
        }
    }
}
