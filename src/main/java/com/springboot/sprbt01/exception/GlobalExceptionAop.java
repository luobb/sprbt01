package com.springboot.sprbt01.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 全局异常捕获类
 */
@ControllerAdvice//表明该类要进行异常捕获
public class GlobalExceptionAop {
    //表名它将捕获的异常类型
    @ExceptionHandler(RuntimeException.class)
    @ResponseBody//返回json格式数据
    public String runtimeException() {
        return "出现异常了，这里捕获异常，相当于以前的手写aop捕获！";
    }
}
