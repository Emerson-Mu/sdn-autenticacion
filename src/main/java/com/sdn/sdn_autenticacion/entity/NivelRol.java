package com.sdn.sdn_autenticacion.entity;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "nivel_rol")
public class NivelRol {
    @Id
    @Column(name = "id_nivel", nullable = false)
    private Integer id;

    @Column(name = "nombre", length = 45)
    private String nombre;

    @OneToMany(mappedBy = "nivelRolIdnivel")
    private Set<Rol> rols = new LinkedHashSet<>();

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

    public Set<Rol> getRols() {
        return rols;
    }

    public void setRols(Set<Rol> rols) {
        this.rols = rols;
    }

}