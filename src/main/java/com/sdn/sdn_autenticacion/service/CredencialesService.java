package com.sdn.sdn_autenticacion.service;

import com.sdn.sdn_autenticacion.entity.Credenciales;
import com.sdn.sdn_autenticacion.repository.CredencialesRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CredencialesService {

    private final CredencialesRepository credencialesRepository;

    public CredencialesService(CredencialesRepository credencialesRepository){
        this.credencialesRepository = credencialesRepository;
    }

    //Métodos disponibles

    public Credenciales crearCredenciales(Credenciales credenciales){
        return credencialesRepository.save(credenciales);
    }

    public List<Credenciales> listarCredenciales(){
        return credencialesRepository.findAll();
    }

    public Optional<Credenciales> buscarCredencialPorId(int id){
        return credencialesRepository.findById(id);
    }


}
