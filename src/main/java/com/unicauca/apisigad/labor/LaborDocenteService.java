package com.unicauca.apisigad.labor;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LaborDocenteService {

    @Autowired
    private LaborDocenteRepository laborDocenteRepository;

    public void crearLaborDocente(TipoLabor tipoLabor, DatosRegistroLaborDocente datosRegistroLaborDocente){
        LaborDocente laborDocente = new LaborDocente(datosRegistroLaborDocente);
        laborDocente.setTipoLabor(tipoLabor);
        laborDocenteRepository.save(laborDocente);
    }
    public List<DatosListadoLaborDocente> listarLaboresDocentes(){
        return laborDocenteRepository.findAll().stream().map(DatosListadoLaborDocente::new).toList();
    }
    public void inactivarLaborDocente(Long id){
        LaborDocente laborDocente = laborDocenteRepository.getReferenceById(id);
        laborDocente.inactivarLaborDocente();
    }
}








