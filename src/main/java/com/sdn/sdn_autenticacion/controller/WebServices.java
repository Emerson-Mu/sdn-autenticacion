package com.sdn.sdn_autenticacion.controller;
import com.sdn.sdn_autenticacion.entity.Credenciales;
import com.sdn.sdn_autenticacion.service.CredencialesService;
import com.sdn.sdn_autenticacion.service.RolService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class WebServices {

    private final RolService rolService;
    private final CredencialesService credencialesService;

    public WebServices(RolService rolService,CredencialesService credencialesService){
        this.rolService = rolService;
        this.credencialesService = credencialesService;
    }


    @GetMapping("/servicio_test")
    public ResponseEntity servicioTest(){

        return new ResponseEntity("Servicio Web funcionando", HttpStatus.OK);
    }

    @GetMapping(value="/listarCredenciales", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity servicioListarCredenciales(){

        List<Credenciales> listaCredenciales = credencialesService.listarCredenciales();

        return new ResponseEntity(listaCredenciales, HttpStatus.OK);
    }


}
