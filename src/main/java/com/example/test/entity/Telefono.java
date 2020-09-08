package com.example.test.entity;

import javax.persistence.*;

import com.example.test.entity.Territorio;

@Entity
@Table(name="telefonos")
public class Telefono {
    @Id
    @Column(name = "numero")
    private String numero;
    @Column(name = "nombre_completo")
    private String nombreCompleto;
    @ManyToOne
    private Territorio territorio;
}

