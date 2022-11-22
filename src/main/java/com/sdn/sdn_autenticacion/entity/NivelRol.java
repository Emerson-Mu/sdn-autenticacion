package com.sdn.sdn_autenticacion.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "nivel_rol")
public class NivelRol {
    @Id
    @Column(name = "idNivel", nullable = false)
    private Integer id;

    @Column(name = "Nombre", length = 45)
    private String nombre;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}