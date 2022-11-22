package com.sdn.sdn_autenticacion.repository;

import com.sdn.sdn_autenticacion.entity.Credenciales;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CredencialesRepository extends JpaRepository<Credenciales,Integer> {
}
