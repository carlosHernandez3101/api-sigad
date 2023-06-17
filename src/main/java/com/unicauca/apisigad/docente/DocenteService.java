package com.unicauca.apisigad.docente;

import com.unicauca.apisigad.usuario.Usuario;
import com.unicauca.apisigad.usuario.UsuarioRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class DocenteService {

    @Autowired
    private DocenteRepository docenteRepository;

    public void registrarDocente(DatosRegistroDocente datosRegistroDocente) {
        System.out.println(datosRegistroDocente);
        docenteRepository.save(new Docente(datosRegistroDocente));
    }

    public Docente obtenerDocenteById(Long id) {
        return docenteRepository.getReferenceById(id);
    }

    public void eliminarDocente(Long id) {

    }

    public void actualizarDocente(){

    }
}
