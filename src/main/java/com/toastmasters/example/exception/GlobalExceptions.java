package com.toastmasters.example.exception;

import com.toastmasters.example.response.ErrorResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptions {

    @ExceptionHandler(ToastmastersClubException.class)
    public ResponseEntity<ErrorResponse> handleCoreIdentityException(ToastmastersClubException exception) {
        ErrorResponse errorResponse = new ErrorResponse(exception.getStatusCode(), exception.getExceptionMessage(), exception.getStatus());
        return new ResponseEntity<>(errorResponse, exception.getStatus());
    }
}