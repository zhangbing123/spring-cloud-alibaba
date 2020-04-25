package com.zb.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户管理
 */
@RequestMapping("/user")
@RestController
public class UserController {

    @GetMapping("/hello")
    public String hello(@RequestParam("name") String name){
        String s = "hello:" + name;
        System.out.printf(s);
        return s;
    }
}
