package com.sdn.sdn_autenticacion.controller;
import com.sdn.sdn_autenticacion.service.RolService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class WebServices {

    private final RolService rolService;

    public WebServices(RolService rolService){
        this.rolService = rolService;
    }

    @GetMapping("/servicio_test")
    public ResponseEntity servicioTest(){

        return new ResponseEntity("Servicio Web funcionando", HttpStatus.OK);
    }


}
