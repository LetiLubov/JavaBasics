package com.db.studies.w1d1.enum_task;

public class ClientHandler implements ErrorHandler {
    @Override
    public void writeErrorMessage() {
        System.out.println("client handler");
    }
}
