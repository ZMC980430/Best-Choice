package com.bestchoice.common.exception;

import com.bestchoice.common.result.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class) // exception handler
    @ResponseBody // return json
    public Result<String> error(Exception e) {
        e.printStackTrace();
        return Result.fail("failed");
    }

    @ExceptionHandler(BaseException.class)
    @ResponseBody
    public Result<String> baseHandler(BaseException e) {
        e.printStackTrace();
        return  Result.build(e.getCode(), e.getMessage());
    }

}
