package com.unicauca.apisigad.controller;

import com.unicauca.apisigad.docente.DatosRegistroDocente;
import com.unicauca.apisigad.docente.Docente;
import com.unicauca.apisigad.docente.DocenteRepository;
import com.unicauca.apisigad.usuario.Usuario;
import com.unicauca.apisigad.usuario.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/docentes")
public class DocenteController {

    @Autowired
    private DocenteRepository docenteRepository;
    private UsuarioRepository usuarioRepository;;

    @PostMapping
    public void registrarDocente(@RequestBody DatosRegistroDocente datosRegistroDocente) {
        Docente docente = new Docente(datosRegistroDocente);
        docenteRepository.save(docente);
        Usuario usuario = new Usuario(datosRegistroDocente.datosRegistroUsuario());
        usuario.setDocente(docente);
        usuarioRepository.save(usuario);

    }
}
