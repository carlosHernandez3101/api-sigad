package com.unicauca.apisigad.facade;

import com.unicauca.apisigad.docente.DatosRegistroDocente;
import com.unicauca.apisigad.usuario.DatosRegistroUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sigadGestion")
public class SIGADController {

    @Autowired
    private SIGADFacade sigadGestion;


//    @PostMapping
//    public void registrarDocente(@RequestBody DatosRegistroDocente datosRegistroDocente) {
//        System.out.println("sigadController");
//        sigadGestion.registrarDocente(datosRegistroDocente);
//    }

    @PostMapping()
    public void asignarUsuario(@RequestBody DatosRegistroUsuario datosRegistroUsuario){
        System.out.println("sigadController - Asignar Usuario");
        sigadGestion.asignarUsuario(datosRegistroUsuario);
    }
}
