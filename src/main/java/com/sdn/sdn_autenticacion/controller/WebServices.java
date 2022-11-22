package com.sdn.sdn_autenticacion.controller;
import com.sdn.sdn_autenticacion.entity.Credenciales;
import com.sdn.sdn_autenticacion.service.CredencialesService;
import com.sdn.sdn_autenticacion.service.RolService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
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

    @GetMapping(value = "/login", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity validarCredenciales(@RequestParam(value = "usuario",defaultValue = "") String usuario,
                                              @RequestParam(value = "contrasenia",defaultValue = "") String contrasenia){

        HashMap<String,String> responseMap = new HashMap<>();
        if(usuario.equals("") || contrasenia.equals("")){
            responseMap.put("msg","credenciales vacias");
            return new ResponseEntity<>(responseMap,HttpStatus.UNAUTHORIZED);
        }else{
            List<Credenciales> listaCredenciales = credencialesService.listarCredenciales();

            for(Credenciales crd1 : listaCredenciales){
                if(crd1.getNombre().equals(usuario)){
                    if(crd1.getPassword().equals(contrasenia)){
                        //Credenciales exitosas
                        responseMap.put("msg","logueo exitoso");
                        return new ResponseEntity<>(responseMap,HttpStatus.OK);

                    }else{
                        //Contraseña erronea
                        responseMap.put("msg","contraseña erronea");
                        return new ResponseEntity<>(responseMap,HttpStatus.UNAUTHORIZED);

                    }
                }
            }
            //Usuario inexistente
            responseMap.put("msg","credenciales erroneas");
            return new ResponseEntity<>(responseMap,HttpStatus.UNAUTHORIZED);
        }



    }
}
