package com.emotion.em.exception;

import com.emotion.em.service.ResponseService;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class EmRestControllAdvice {
    
    private final ResponseService responseService;
    
    @ExceptionHandler(SampleException.class)
    public @ResponseBody AppError sampleError(SampleException e) {
        AppError appError = new AppError();
        appError.setMessage(stringBuilder.toString());
        appError.setReason(stringBuilder.toString());
        return appError;
    }
    
}
