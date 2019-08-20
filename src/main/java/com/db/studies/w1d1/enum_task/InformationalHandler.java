package com.db.studies.w1d1.enum_task;

public class InformationalHandler implements ErrorHandler {
    @Override
    public void writeErrorMessage() {
        System.out.println("informational handler");
    }
}
