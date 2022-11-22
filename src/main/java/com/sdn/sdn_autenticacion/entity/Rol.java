package com.sdn.sdn_autenticacion.entity;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "rol")
public class Rol {
    @Id
    @Column(name = "idRol", nullable = false)
    private Integer id;

    @Column(name = "nombre", length = 45)
    private String nombre;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "Nivel_rol_idNivel", nullable = false)
    private NivelRol nivelRolIdnivel;

    @OneToMany(mappedBy = "rolIdrol")
    private Set<UsuarioAuth> usuarioAuths = new LinkedHashSet<>();

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

    public NivelRol getNivelRolIdnivel() {
        return nivelRolIdnivel;
    }

    public void setNivelRolIdnivel(NivelRol nivelRolIdnivel) {
        this.nivelRolIdnivel = nivelRolIdnivel;
    }

    public Set<UsuarioAuth> getUsuarioAuths() {
        return usuarioAuths;
    }

    public void setUsuarioAuths(Set<UsuarioAuth> usuarioAuths) {
        this.usuarioAuths = usuarioAuths;
    }

}