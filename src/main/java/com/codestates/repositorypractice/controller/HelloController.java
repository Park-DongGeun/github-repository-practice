package com.codestates.repositorypractice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloController {
    @GetMapping()
    public String printHello(){
        System.out.println("test");
        return "To-Do Application!";
    }
}
