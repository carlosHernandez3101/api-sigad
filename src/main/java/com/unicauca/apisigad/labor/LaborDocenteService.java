package com.unicauca.apisigad.labor;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaborDocenteService {

    @Autowired
    private LaborDocenteRepository laborDocenteRepository;


    public void createLaborDocente(TipoLabor tipoLabor, DatosRegistroLaborDocente datosRegistroLaborDocente){
        LaborDocente laborDocente = new LaborDocente(datosRegistroLaborDocente);
        laborDocente.setTipoLabor(tipoLabor);
        laborDocenteRepository.save(laborDocente);
    }
}
