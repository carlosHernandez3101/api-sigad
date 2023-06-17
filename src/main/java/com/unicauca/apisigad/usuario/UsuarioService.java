package com.unicauca.apisigad.usuario;

import com.unicauca.apisigad.docente.Docente;
import com.unicauca.apisigad.docente.DocenteRepository;
import com.unicauca.apisigad.docente.DocenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;


    public void crearUsuario(Docente docente, DatosRegistroUsuario datosRegistroUsuario) {
        System.out.println("Service user");
        System.out.println(docente);
        Usuario usuario = new Usuario(datosRegistroUsuario);
        usuario.setDocente(docente);
        usuarioRepository.save(usuario);
    }
}
