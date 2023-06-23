package com.unicauca.apisigad.labor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoLaborService {

    @Autowired
    private TipoLaborRepository tipoLaborRepository;

    public void crearTipoLabor(DatosRegistroTipoLabor datosRegistroTipoLabor){
        System.out.println(datosRegistroTipoLabor);
        tipoLaborRepository.save(new TipoLabor(datosRegistroTipoLabor));
    }
    public TipoLabor obtenerTipoLaborById(Long id){
        return tipoLaborRepository.getReferenceById(id);
    }
    public List<DatosListadoTipoLabor> listarTiposLabores(){
        return tipoLaborRepository.findAll().stream().map(DatosListadoTipoLabor::new).toList();
    }
    public void inactivarTipoLabor(Long id){
        TipoLabor tipoLabor = tipoLaborRepository.getReferenceById(id);
        tipoLabor.inactivarTipoLabor();
    }


}
