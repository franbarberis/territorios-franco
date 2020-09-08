package com.example.test.controllers;

import com.example.test.dto.TelefonoDTO;
import com.example.test.entity.Telefono;
import com.example.test.service.TelefonoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/telefono")
public class TelefonoController {
    @Autowired
    private TelefonoService telefonoService;
    private Logger LOG = LoggerFactory.getLogger(TerritorioController.class);

    public TelefonoController(TelefonoService telefonoService) {
        this.telefonoService = telefonoService;
    }

    @PostMapping()
    public ResponseEntity<?> save(@RequestBody TelefonoDTO telefono) {
        try {
            telefonoService.save(telefono);
            return new ResponseEntity<>(telefono, HttpStatus.CREATED);
        } catch (Exception e) {
            LOG.error("Error trying insert message {} , stacktrace {}", e.getMessage(), e.getStackTrace());
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

    }

    @GetMapping("/{numero}")
    public ResponseEntity<?> findTelefono(@PathVariable String numero) {
        Telefono telefono = telefonoService.getTelefono(numero);
        if (telefono == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(telefono, HttpStatus.OK);
    }

    @DeleteMapping("/{numero}")
    public ResponseEntity<?> deleteTelefono(@PathVariable String numero) {
        try {
            telefonoService.delete(numero);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            LOG.error("Error trying delete message {} , stacktrace {}", e.getMessage(), e.getStackTrace());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
