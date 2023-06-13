package com.example.demo.controller;
/*
 * @liyue  李玥
 *     @开荒练习  1饭
 */


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class UserController {

    @GetMapping("/api/user")
    public String user(){
        return "hello";
    }
}
