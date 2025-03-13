package com.fantastic.adventure.web;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class TestControler {

    @GetMapping("/test")
    public String test(@RequestParam String param) {
        return new String("test for " + param);
    }
    
}