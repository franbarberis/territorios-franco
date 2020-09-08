package com.example.test.service;

import com.example.test.entity.User;

import java.util.List;

public interface IUserService {

    public List<User> findAll();

    public void save (User user);

    public User findById(Long id);

}