package com.db.studies.w1d1.enum_task;

public enum WebError {
    INFORMATIONAL(100, 199, new InformationalHandler()),
    SUCCESS(200, 299, new SuccessHandler()),
    REDIRECTION(300, 399, new RedirectionHandler()),
    CLIENT_ERROR(400, 499, new ClientHandler()),
    SERVER_ERROR(500, 599, new ServerHandler());

    private int minValue;
    private int maxValue;
    private ErrorHandler handler;
//    private int codeValue;

    WebError(int minValue, int maxValue, ErrorHandler handler) {
        this.minValue = minValue;
        this.maxValue = maxValue;
        this.handler = handler;
    }
    public static void handleException(int code){
        for (WebError value : WebError.values()) {
            if (value.minValue <= code && code <= value.maxValue){
                value.handler.writeErrorMessage();
                return;
            }
        }
        throw new IllegalArgumentException("I don't have handler for error code = " + code);
    }
}
