package com.example.test.dto;

import com.example.test.entity.Territorio;

public class TelefonoDTO {

    private String numero;
    private String nombreCompleto;
    private Long idTerritorio;
    private Long idEstadoTelefono;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public Long getIdTerritorio() {
        return idTerritorio;
    }

    public Long getIdEstadoTelefono() {
        return idEstadoTelefono;
    }

    public void setIdEstadoTelefono(Long idEstadoTelefono) {
        this.idEstadoTelefono = idEstadoTelefono;
    }

    public void setIdTerritorio(Long idTerritorio) {
        this.idTerritorio = idTerritorio;
    }
}
