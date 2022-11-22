ALTER TABLE rol
    ADD CONSTRAINT FK_ROL_ON_NIVEL_ROL_IDNIVEL FOREIGN KEY (nivel_rol_id_nivel) REFERENCES nivel_rol (id_nivel);

ALTER TABLE usuario_auth
    ADD CONSTRAINT FK_USUARIO_AUTH_ON_EQUIPOS_REGISTRADOS_MAC_DISPOSITIVO FOREIGN KEY (equipos_registrados_mac_dispositivo) REFERENCES equipos_registrados (mac_dispositivo);

ALTER TABLE usuario_auth
    ADD CONSTRAINT FK_USUARIO_AUTH_ON_ROL_IDROL FOREIGN KEY (rol_id_rol) REFERENCES rol (id_rol);

ALTER TABLE rol
DROP
FOREIGN KEY fk_Rol_Nivel_rol;

ALTER TABLE usuario_auth
DROP
FOREIGN KEY fk_Usuario_Auth_Equipos_Registrados1;

ALTER TABLE usuario_auth
DROP
FOREIGN KEY fk_Usuario_Auth_Rol1;

ALTER TABLE credenciales
DROP
COLUMN idCredenciales;

ALTER TABLE nivel_rol
DROP
COLUMN idNivel;

ALTER TABLE rol
DROP
COLUMN idRol;

ALTER TABLE rol
DROP
COLUMN Nivel_rol_idNivel;

ALTER TABLE usuario_auth
DROP
COLUMN idUsuario_Auth;

ALTER TABLE usuario_auth
DROP
COLUMN Rol_idRol;

ALTER TABLE credenciales
    ADD PRIMARY KEY (id_credenciales);

ALTER TABLE nivel_rol
    ADD PRIMARY KEY (id_nivel);

ALTER TABLE rol
    ADD PRIMARY KEY (id_rol);

ALTER TABLE usuario_auth
    ADD PRIMARY KEY (id_usuario_auth);
ALTER TABLE rol
    ADD CONSTRAINT FK_ROL_ON_NIVEL_ROL_IDNIVEL FOREIGN KEY (nivel_rol_id_nivel) REFERENCES nivel_rol (id_nivel);

ALTER TABLE usuario_auth
    ADD CONSTRAINT FK_USUARIO_AUTH_ON_EQUIPOS_REGISTRADOS_MAC_DISPOSITIVO FOREIGN KEY (equipos_registrados_mac_dispositivo) REFERENCES equipos_registrados (mac_dispositivo);

ALTER TABLE usuario_auth
    ADD CONSTRAINT FK_USUARIO_AUTH_ON_ROL_IDROL FOREIGN KEY (rol_id_rol) REFERENCES rol (id_rol);

ALTER TABLE rol
    DROP FOREIGN KEY fk_Rol_Nivel_rol;

ALTER TABLE usuario_auth
    DROP FOREIGN KEY fk_Usuario_Auth_Equipos_Registrados1;

ALTER TABLE usuario_auth
    DROP FOREIGN KEY fk_Usuario_Auth_Rol1;

ALTER TABLE credenciales
    DROP COLUMN idCredenciales;

ALTER TABLE nivel_rol
    DROP COLUMN idNivel;

ALTER TABLE rol
    DROP COLUMN idRol;

ALTER TABLE rol
    DROP COLUMN Nivel_rol_idNivel;

ALTER TABLE usuario_auth
    DROP COLUMN idUsuario_Auth;

ALTER TABLE usuario_auth
    DROP COLUMN Rol_idRol;

ALTER TABLE credenciales
    ADD PRIMARY KEY (id_credenciales);

ALTER TABLE nivel_rol
    ADD PRIMARY KEY (id_nivel);

ALTER TABLE rol
    ADD PRIMARY KEY (id_rol);

ALTER TABLE usuario_auth
    ADD PRIMARY KEY (id_usuario_auth);