package com.sdn.sdn_autenticacion.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "equipos_registrados")
public class EquiposRegistrado {
    @Id
    @Column(name = "Mac_dispositivo", nullable = false, length = 30)
    private String id;

    @Column(name = "nombre", length = 30)
    private String nombre;

    @Column(name = "dispositivo_id")
    private Integer dispositivoId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDispositivoId() {
        return dispositivoId;
    }

    public void setDispositivoId(Integer dispositivoId) {
        this.dispositivoId = dispositivoId;
    }

}