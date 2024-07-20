package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    //Test
    @GetMapping("/")
    public String demo(){
        return "Hello CICD, Test ngrok";
    }
}
