package com.example.test.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="territorios")
public class Territorio {
    @Id
    @Column(name = "id_territorio")
    private Long idTerritorio;
    @Column(name = "nombre_territorio")
    private String nombreTerritorio;

    public Long getIdTerritorio() {
        return idTerritorio;
    }

    public void setIdTerritorio(Long idTerritorio) {
        this.idTerritorio = idTerritorio;
    }

    public String getNombreTerritorio() {
        return nombreTerritorio;
    }

    public void setNombreTerritorio(String nombreTerritorio) {
        this.nombreTerritorio = nombreTerritorio;
    }
}
