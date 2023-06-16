package com.unicauca.apisigad.facade;

import com.unicauca.apisigad.docente.DatosRegistroDocente;
import com.unicauca.apisigad.docente.DocenteService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SIGADFacade {

    private DocenteService docenteService;

    public void realizarEvaluacion() {}
    @PostMapping
    public void registrarDocente(DatosRegistroDocente datosRegistroDocente){

    }
    public void crearLaborAcademica(){}
    public void crearPeriodoAcademico(){}
    public void notificarDocentes(){}
}
