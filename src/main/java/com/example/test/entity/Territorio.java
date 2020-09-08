package com.example.test.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table(name = "territorios")
public class Territorio {
    @Id
    @Column(name = "id_territorio")
    private Long idTerritorio;
    @Column(name = "nombre_territorio")
    private String nombreTerritorio;

    @Column(name = "fecha_inicio")
    private Timestamp fechaInicio;

    @Column(name = "fecha_fin")
    private Timestamp fechaFin;

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

    public Timestamp getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Timestamp fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Timestamp getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Timestamp fechaFin) {
        this.fechaFin = fechaFin;
    }
}
