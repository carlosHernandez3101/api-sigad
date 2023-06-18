package com.unicauca.apisigad.periodo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PeriodoAcademicoService {

    @Autowired
    private PeriodoAcademicoRepository periodoRepository;
    
    public PeriodoAcademico registrarPerido(DatosRegistroPeriodo datosRegistroPeriodo) {
        System.out.println("Service Periodo");
        System.out.println(datosRegistroPeriodo);
        return periodoRepository.save(new PeriodoAcademico(datosRegistroPeriodo));
    }
}
