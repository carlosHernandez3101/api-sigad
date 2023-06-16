package com.unicauca.apisigad.docente;

import com.unicauca.apisigad.usuario.Usuario;
import com.unicauca.apisigad.usuario.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class DocenteService {

    @Autowired
    private DocenteRepository docenteRepository;
    @Autowired
    private UsuarioRepository usuarioRepository;

    public void registrarDocente(DatosRegistroDocente datosRegistroDocente) {
        System.out.println(datosRegistroDocente);
        Docente docente = new Docente(datosRegistroDocente);
        docenteRepository.save(docente);
        Usuario usuario = new Usuario(datosRegistroDocente.usuario());
        usuario.setDocente(docente);
        usuarioRepository.save(usuario);
    }
}
