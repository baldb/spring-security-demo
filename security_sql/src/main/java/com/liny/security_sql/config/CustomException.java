package com.liny.security_sql.config;

/**
 * @author linyi
 * @date 2022/8/22
 * 1.0
 */
/**
 * 自定义业务异常
 */
public class CustomException extends RuntimeException{
    public CustomException(String message){
        super(message);
    }
}
