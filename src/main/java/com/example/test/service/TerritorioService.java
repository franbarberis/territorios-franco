package com.example.test.service;

import com.example.test.entity.Territorio;
import com.example.test.repository.TerritorioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TerritorioService {
    @Autowired
    private TerritorioRepository territorioRepository;

    public TerritorioService(TerritorioRepository territorioRepository) {
        this.territorioRepository = territorioRepository;
    }

    public Territorio findById(Long id) {
        return territorioRepository.findById(id).orElse(null);
    }
}
