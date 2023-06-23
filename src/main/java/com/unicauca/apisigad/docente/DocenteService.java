package com.unicauca.apisigad.docente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocenteService {

    @Autowired
    private DocenteRepository docenteRepository;

    public void registrarDocente(DatosRegistroDocente datosRegistroDocente) {
        docenteRepository.save(new Docente(datosRegistroDocente));
    }
    public Docente obtenerDocenteById(Long id) {
        return docenteRepository.getReferenceById(id);
    }
    public DatosRespuestaDocente mostrarDatosDocenteById(Long id) {
        Docente docente = obtenerDocenteById(id);
        return new DatosRespuestaDocente(docente.getId(), docente.getNombres(),
                docente.getApellidos(), docente.getTipo_identificacion(), docente.getIdentificacion(),
                docente.getTipo_docente(), docente.getCorreo_institucional(), docente.getUltimo_titulo_academico());
    }
    public List<DatosListadoDocente> obtenerListadoDocentes(){
        return docenteRepository.findAll().stream().map(DatosListadoDocente::new).toList();
    }
    public void inactivarDocente(Long id) {
        Docente docente = docenteRepository.getReferenceById(id);
        docente.inactivarDocente();
    }
    public void actualizarDocente(DatosActualizarDocente datosActualizarDocente){
        Docente docente = docenteRepository.getReferenceById(datosActualizarDocente.id());
        docente.actualizarDocente(datosActualizarDocente);
    }
}
