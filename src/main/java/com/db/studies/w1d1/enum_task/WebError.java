package com.db.studies.w1d1.enum_task;

public enum WebError {
    INFORMATIONAL(100, 199){
        @Override
        void writeErrorMessage() {
            System.out.println("informational handler");
        }
    },
    SUCCESS(200, 299) {
        @Override
        void writeErrorMessage() {
            System.out.println("success handler");
        }
    },
    REDIRECTION(300, 399) {
        @Override
        void writeErrorMessage() {
            System.out.println("redirection handler");
        }
    },
    CLIENT_ERROR(400, 499) {
        @Override
        void writeErrorMessage() {
            System.out.println("client handler");
        }
    },
    SERVER_ERROR(500, 599) {
        @Override
        void writeErrorMessage() {
            System.out.println("server handler");
        }
    };

    private int minValue;
    private int maxValue;
//    private int codeValue;
    abstract void writeErrorMessage();

    WebError(int minValue, int maxValue) {
        this.minValue = minValue;
        this.maxValue = maxValue;
    }

    public static void handleException(int code){
        for (WebError value : WebError.values()) {
            if (value.minValue <= code && code <= value.maxValue){
                value.writeErrorMessage();
                return;
            }
        }
        throw new IllegalArgumentException("I don't have handler for this error code");
    }
}
