package com.tian.jianZaiJi.utils.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 全局捕获异常
 */
@RestControllerAdvice
public class Excep {

    @ExceptionHandler(value = MyException.class)
    public String  errorHandler(Exception ex) {
        System.out.println("捕获抛出的异常");
        return "服务异常！";

    }

}
