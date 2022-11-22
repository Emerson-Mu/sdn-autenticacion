package com.sdn.sdn_autenticacion.entity;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "equipos_registrados")
public class EquiposRegistrados {
    @Id
    @Column(name = "Mac_dispositivo", nullable = false, length = 30)
    private String id;

    @Column(name = "nombre", length = 30)
    private String nombre;

    @Column(name = "dispositivo_id")
    private Integer dispositivoId;

    @OneToMany(mappedBy = "equiposRegistradosMacDispositivo")
    private Set<UsuarioAuth> usuarioAuths = new LinkedHashSet<>();

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

    public Set<UsuarioAuth> getUsuarioAuths() {
        return usuarioAuths;
    }

    public void setUsuarioAuths(Set<UsuarioAuth> usuarioAuths) {
        this.usuarioAuths = usuarioAuths;
    }

}