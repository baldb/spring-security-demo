package com.liny.controller;

import org.springframework.web.bind.annotation.GetMapping;
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
}
