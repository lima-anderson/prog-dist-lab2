package com.example.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloSpringController {

    @GetMapping("/hello")
    public String dizerOi(){
        return "Hello Anderson Lima";
    }
}
