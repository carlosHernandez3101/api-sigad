package com.unicauca.apisigad.controller;

import com.unicauca.apisigad.facade.SIGADFacade;
import com.unicauca.apisigad.labor.DatosRegistroLaborDocente;
import com.unicauca.apisigad.labor.DatosRegistroTipoLabor;
import com.unicauca.apisigad.periodo.DatosRegistroPeriodo;
import com.unicauca.apisigad.periodo.PeriodoAcademico;

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

    @GetMapping("/periodos")
    @ResponseBody
    public Iterable<PeriodoAcademico> obtenerPeriodos() {
        Iterable<PeriodoAcademico> periodos = sigadGestion.findAllPeriodos();
        return periodos;
    }

    @PostMapping("/crearPeriodo")
    public PeriodoAcademico crearPeriodoAcademico(@RequestBody DatosRegistroPeriodo datosRegistroPeriodo) {
        System.out.println("sigadController - Asignar Periodo");
        return sigadGestion.crearPeriodoAcademico(datosRegistroPeriodo);
    }
    @PostMapping("/registrarTipoLabor")
    public void registrarTipoLabor(@RequestBody DatosRegistroTipoLabor datosRegistroTipoLabor){
        System.out.println("sigadController - Registrar TipoLabor");
        sigadGestion.crearTipoLaborAcademica(datosRegistroTipoLabor);
    }

    @PostMapping("/registrarLaborDocente")
    public void registrarLaborDocente(@RequestBody DatosRegistroLaborDocente datosRegistroLaborDocente){
        System.out.println("sigadController - Registrar Labor Docente");
        sigadGestion.crearLaborDocente(datosRegistroLaborDocente);
    }
}
