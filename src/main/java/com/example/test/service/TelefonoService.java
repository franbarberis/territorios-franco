package com.example.test.service;

import com.example.test.dto.TelefonoDTO;
import com.example.test.entity.Telefono;
import com.example.test.repository.TelefonoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TelefonoService {
    @Autowired
    private TelefonoRepository telefonoRepository;
    @Autowired
    private TerritorioService territorioService;
    @Autowired
    private EstadoTelefonoService estadoTelefonoService;


    public TelefonoService(TelefonoRepository telefonoRepository, TerritorioService territorioService,
                           EstadoTelefonoService estadoTelefonoService) {
        this.telefonoRepository = telefonoRepository;
        this.territorioService = territorioService;
        this.estadoTelefonoService = estadoTelefonoService;
    }

    public Telefono getTelefono(String numero) {
        return telefonoRepository.findTelefono(numero);
    }

    public void save(TelefonoDTO telefonoDTO) {
        telefonoRepository.save(parseDtoToEntity(telefonoDTO));
    }


    public void delete(String numero) {
        telefonoRepository.deleteTelefono(numero);
    }

    private Telefono parseDtoToEntity(TelefonoDTO telefonoDTO) {
        Telefono telefono = new Telefono();
        telefono.setNumero(telefonoDTO.getNumero());
        telefono.setNombreCompleto(telefonoDTO.getNombreCompleto());
        telefono.setTerritorio(territorioService.findById(telefonoDTO.getIdTerritorio()));
        telefono.setEstadoTelefono(estadoTelefonoService.findById(telefonoDTO.getIdEstadoTelefono()));
        return telefono;
    }

}
