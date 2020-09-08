package com.example.test.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {

    @GetMapping("/hello")
    public ResponseEntity<?> getSaludo(){
        return new ResponseEntity<>("saludo", HttpStatus.OK);
    }
}
