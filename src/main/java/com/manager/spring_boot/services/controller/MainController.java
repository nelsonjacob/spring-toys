package com.manager.spring_boot.services.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Used as test to get into simple application endpoint
 */
@RestController
public class MainController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello Java Spring Boot!";
    }


}
