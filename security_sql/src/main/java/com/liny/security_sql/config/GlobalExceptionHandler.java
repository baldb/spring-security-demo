package com.liny.security_sql.config;

/**
 * @author linyi
 * @date 2022/8/22
 * 1.0
 */

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


/**
 * 处理全局异常
 */
@Slf4j
@ControllerAdvice(annotations = {RestController.class, Controller.class})
@ResponseBody
public class GlobalExceptionHandler {


    /**
     * 异常处理方法
     *
     * @return
     */
    @ExceptionHandler(CustomException.class)
    public String exceptionHandler(CustomException ex) {
        log.error(ex.getMessage());
        //将自定义异常信息返给前端
        return ex.getMessage();
    }

}
