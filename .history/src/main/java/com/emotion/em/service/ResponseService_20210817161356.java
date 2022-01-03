package com.emotion.em.service;

import com.emotion.em.model.response.CommonResult;

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

        public int getCode() { return code; }
        public String getMessage() { return message; }
    }

    public CommonResult getSuccessResult() {
        CommonResult result = new CommonResult();
        setSuccessResult(result);
        resutn result;
    }

    



    
}
