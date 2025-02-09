package com.terminator.spaceship_spring_api;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/api/v1")
public class GreetingController {
    
    @GetMapping("/hello")
    public String message() {
        return "Hello world";
    }
}
