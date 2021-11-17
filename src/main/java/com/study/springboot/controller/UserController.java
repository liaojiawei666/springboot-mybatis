package com.study.springboot.controller;

import com.study.springboot.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserMapper userMapper;
    @GetMapping("/hello")
    public String hello() {
        System.out.println(userMapper.getNameById(1L));
        return "hello";
    }

}
