package com.example.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/user")
public class HomeController {

    @GetMapping("/say-hello")
    public ResponseEntity<String> sayHello(){
        return ResponseEntity.ok("Hello from Spring boot 3.0.1 and Spring Security 6");
    }
}
