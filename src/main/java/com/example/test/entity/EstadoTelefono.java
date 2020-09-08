package com.example.test.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "estados_telefonos")
public class EstadoTelefono {
    @Id
    @Column(name = "id_estado_telefono")
    private Long idEstadoTelefono;
    @Column(name = "denom_estado_telefono")
    private String denomEstadoTelefono;

    public Long getIdEstadoTelefono() {
        return idEstadoTelefono;
    }

    public void setIdEstadoTelefono(Long idEstadoTelefono) {
        this.idEstadoTelefono = idEstadoTelefono;
    }

    public String getDenomEstadoTelefono() {
        return denomEstadoTelefono;
    }

    public void setDenomEstadoTelefono(String denomEstadoTelefono) {
        this.denomEstadoTelefono = denomEstadoTelefono;
    }
}
