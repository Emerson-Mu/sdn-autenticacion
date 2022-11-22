package com.sdn.sdn_autenticacion.entity;

import javax.persistence.*;

@Entity
@Table(name = "usuario_auth")
public class UsuarioAuth {
    @Id
    @Column(name = "id_usuario_auth", nullable = false)
    private Integer id;

    @Column(name = "switch_actual", length = 30)
    private String switchActual;

    @Column(name = "puerto")
    private Integer puerto;

    @Column(name = "usuario_authcol", length = 45)
    private String usuarioAuthcol;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "equipos_registrados_mac_dispositivo", nullable = false)
    private EquiposRegistrados equiposRegistradosMacDispositivo;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "rol_id_rol", nullable = false)
    private Rol rolIdrol;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSwitchActual() {
        return switchActual;
    }

    public void setSwitchActual(String switchActual) {
        this.switchActual = switchActual;
    }

    public Integer getPuerto() {
        return puerto;
    }

    public void setPuerto(Integer puerto) {
        this.puerto = puerto;
    }

    public String getUsuarioAuthcol() {
        return usuarioAuthcol;
    }

    public void setUsuarioAuthcol(String usuarioAuthcol) {
        this.usuarioAuthcol = usuarioAuthcol;
    }

    public EquiposRegistrados getEquiposRegistradosMacDispositivo() {
        return equiposRegistradosMacDispositivo;
    }

    public void setEquiposRegistradosMacDispositivo(EquiposRegistrados equiposRegistradosMacDispositivo) {
        this.equiposRegistradosMacDispositivo = equiposRegistradosMacDispositivo;
    }

    public Rol getRolIdrol() {
        return rolIdrol;
    }

    public void setRolIdrol(Rol rolIdrol) {
        this.rolIdrol = rolIdrol;
    }

}