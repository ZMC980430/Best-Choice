package com.bestchoice.common.exception;

import com.bestchoice.common.result.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalException {

    @ExceptionHandler(Exception.class) // exception handler
    @ResponseBody // return json
    public Result<String> error(Exception e) {
        e.printStackTrace();
        return Result.fail("failed");
    }

    @ExceptionHandler(BaseException.class)
    @ResponseBody
    public Result<String> error(BaseException e) {
        e.printStackTrace();
        return  Result.fail("base exception");
    }

}
