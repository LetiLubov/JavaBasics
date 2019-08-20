package com.db.studies.w1d1.enum_task;

public class RedirectionHandler implements ErrorHandler {
    @Override
    public void writeErrorMessage() {
        System.out.println("redirection handler");
    }
}
