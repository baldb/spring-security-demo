package com.liny.security_sql.controller;

import com.liny.security_sql.pojo.Users;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author linyi
 * @date 2022/8/20
 * 1.0
 */
@RestController
public class testController {
    @GetMapping("/test")
    public String hello(){
        return "hello security";
    }

    @GetMapping("/index")
    public String index(){
        return "hello index";
    }

    @GetMapping("/find")
    public String find(){
        return "hello find";
    }
    @GetMapping("/sale/001")
    public String sale01(){
        return "hello 001";
    }
    @GetMapping("/sale/002")
    public String sale02(){
        return "hello 002";
    }

}
