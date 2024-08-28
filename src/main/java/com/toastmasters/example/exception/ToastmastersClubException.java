package com.toastmasters.example.exception;

import lombok.Getter;
import org.springframework.http.HttpStatusCode;

@Getter
public class ToastmastersClubException extends RuntimeException {

    private final String exceptionMessage;
    private final Integer statusCode;
    private final HttpStatusCode status;
    private final String workFlow;

    public ToastmastersClubException(String exceptionMessage, Integer statusCode, HttpStatusCode status, String workFlow){
        super(exceptionMessage);
        this.exceptionMessage=exceptionMessage;
        this.statusCode=statusCode;
        this.status=status;
        this.workFlow=workFlow;
    }
}