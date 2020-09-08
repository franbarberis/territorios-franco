package com.example.test.entity;

import javax.persistence.*;

import com.example.test.entity.Territorio;

@Entity
@Table(name = "telefonos")
public class Telefono {
    @Id
    @Column(name = "numero")
    private String numero;
    @Column(name = "nombre_completo")
    private String nombreCompleto;
    @ManyToOne
    @JoinColumn(name = "id_territorio")
    private Territorio territorio;
    @ManyToOne
    @JoinColumn(name = "id_estado_telefono")
    private EstadoTelefono estadoTelefono;


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

    public EstadoTelefono getEstadoTelefono() {
        return estadoTelefono;
    }

    public void setEstadoTelefono(EstadoTelefono estadoTelefono) {
        this.estadoTelefono = estadoTelefono;
    }

    public Territorio getTerritorio() {
        return territorio;
    }

    public void setTerritorio(Territorio territorio) {
        this.territorio = territorio;
    }
}

