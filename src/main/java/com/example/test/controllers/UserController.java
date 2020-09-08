package com.example.test.controllers;

import java.util.List;

import com.example.test.entity.User;
import com.example.test.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {

    @Autowired
    private IUserService userService;

    @Autowired
    private BCryptPasswordEncoder bCryptPassowrdEncoder;

    @GetMapping("/users")
    public ResponseEntity<?> obtenerUsuarios() {
        List<User> users = userService.findAll();
        if (users != null) {
            return new ResponseEntity<>(users, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/create_user")
    public ResponseEntity<?> create(@RequestBody User user) {
        user.setPassword(bCryptPassowrdEncoder.encode(user.getPassword()));
        this.userService.save(user);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}