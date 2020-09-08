package com.example.test.controllers;

import com.example.test.entity.Territorio;
import com.example.test.service.TerritorioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class TerritorioController {
    @Autowired
    private TerritorioService territorioService;

    public TerritorioController(TerritorioService territorioService) {
        this.territorioService = territorioService;
    }

    @GetMapping("/territorio/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) {
        Territorio territorio = territorioService.findById(id);
        if (territorio == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(territorio, HttpStatus.OK);
    }
}
