package com.emotion.em.service;

public class ResponseService {
    
    public enum CommonResponse {
        SUCCESS(0000, "성공하였습니다."),
        FAILED(9999, "실패하였습니다.");

        int code;
        String message;

        CommonResponse(int code, String message) {
            this.code = code;
            this.message = message;

        }

    }
    
}
