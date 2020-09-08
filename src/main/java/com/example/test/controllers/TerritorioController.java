package com.example.test.controllers;

import com.example.test.entity.Territorio;
import com.example.test.service.TerritorioService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/territorios")
public class TerritorioController {
    @Autowired
    private TerritorioService territorioService;
    private Logger LOG = LoggerFactory.getLogger(TerritorioController.class);

    public TerritorioController(TerritorioService territorioService) {
        this.territorioService = territorioService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) {
        Territorio territorio = territorioService.findById(id);
        if (territorio == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(territorio, HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<?> save(@RequestBody Territorio territorio) {
        try {
            territorioService.save(territorio);
            return new ResponseEntity<>(territorio, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

    }
}
