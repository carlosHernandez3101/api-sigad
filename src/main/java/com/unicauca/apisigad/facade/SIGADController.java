package com.unicauca.apisigad.facade;

import com.unicauca.apisigad.docente.DatosRegistroDocente;
import com.unicauca.apisigad.periodo.DatosRegistroPeriodo;
import com.unicauca.apisigad.periodo.PeriodoAcademico;
import com.unicauca.apisigad.usuario.DatosRegistroUsuario;
import com.unicauca.apisigad.usuario.Usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

@RestController
@RequestMapping("/sigadGestion")
public class SIGADController {

    @Autowired
    private SIGADFacade sigadGestion;

    // @PostMapping
    // public void registrarDocente(@RequestBody DatosRegistroDocente datosRegistroDocente) {
    //     System.out.println("sigadController");
    //     sigadGestion.registrarDocente(datosRegistroDocente);
    // }

    // @PostMapping()
    // public void asignarUsuario(@RequestBody DatosRegistroUsuario datosRegistroUsuario) {
    //     System.out.println("sigadController - Asignar Usuario");
    //     sigadGestion.asignarUsuario(datosRegistroUsuario);
    // }

    @GetMapping({"/periodoss"})
    public Iterable<PeriodoAcademico> obtenerperiodos(Model model) {
        return sigadGestion.findAllPeriodos();
    }

    @PostMapping("/crearPeriodo")
    public PeriodoAcademico crearPeriodoAcademico(@RequestBody DatosRegistroPeriodo datosRegistroPeriodo) {
        System.out.println("sigadController - Asignar Periodo");
        return sigadGestion.crearPeriodoAcademico(datosRegistroPeriodo);
    }
}
