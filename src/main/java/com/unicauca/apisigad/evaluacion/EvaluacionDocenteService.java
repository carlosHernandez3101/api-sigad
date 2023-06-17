package com.unicauca.apisigad.evaluacion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EvaluacionDocenteService {

    @Autowired
    private EvaluacionDocenteRepository evaluacionDocenteRepository;

    public void realizarEvaluacionDocente(DatosRegistroEvaluacionDocente datosRegistroEvaluacionDocente){
        EvaluacionDocente evaluacionDocente = new EvaluacionDocente(datosRegistroEvaluacionDocente);
    }

}
