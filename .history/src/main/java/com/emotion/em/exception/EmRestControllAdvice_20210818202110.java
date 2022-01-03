package com.emotion.em.exception;

import com.emotion.em.service.ResponseService;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class EmRestControllAdvice {
       
    ResponseService responseService;
    
    @ExceptionHandler(RuntimeException.class)
    public @ResponseBody ResponseService sampleError(RuntimeException e) {
        return responseService.getErrorResult("");      
    }
    
}
