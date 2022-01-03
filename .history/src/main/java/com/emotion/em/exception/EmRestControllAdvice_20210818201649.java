package com.emotion.em.exception;

import com.emotion.em.service.ResponseService;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class EmRestControllAdvice {
       
    private final ResponseService responseService;
    
    @ExceptionHandler(RuntimeException.class)
    public @ResponseBody AppError sampleError(RuntimeException e) {
        AppError appError = new AppError();        
        appError.setMessage("");
        appError.setReason("");
        return appError;
    }
    
}
