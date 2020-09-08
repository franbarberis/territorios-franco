package com.example.test.service;

import com.example.test.entity.EstadoTelefono;
import com.example.test.repository.EstadoTelefonoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstadoTelefonoService {

    @Autowired
    private EstadoTelefonoRepository estadoTelefonoRepository;

    public EstadoTelefonoService(EstadoTelefonoRepository estadoTelefonoRepository) {
        this.estadoTelefonoRepository = estadoTelefonoRepository;
    }

    public EstadoTelefono findById(Long id) {
        return estadoTelefonoRepository.findById(id).orElse(null);
    }
}
