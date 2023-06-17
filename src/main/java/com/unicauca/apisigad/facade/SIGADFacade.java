package com.unicauca.apisigad.facade;

import com.unicauca.apisigad.docente.DatosRegistroDocente;
import com.unicauca.apisigad.docente.Docente;
import com.unicauca.apisigad.docente.DocenteService;
import com.unicauca.apisigad.usuario.DatosRegistroUsuario;
import com.unicauca.apisigad.usuario.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Service
public class SIGADFacade {
    @Autowired
    private DocenteService docenteService;
    @Autowired
    private UsuarioService usuarioService;

    public void realizarEvaluacion() {}
    public void registrarDocente(DatosRegistroDocente datosRegistroDocente){
        System.out.println("sigadFacade registrar");
        docenteService.registrarDocente(datosRegistroDocente);
    }
    public void asignarUsuario(DatosRegistroUsuario datosRegistroUsuario){
        System.out.println("sigadFacade asignar");
        Docente docente = docenteService.obtenerDocenteById(datosRegistroUsuario.docente_id());
        usuarioService.crearUsuario(docente, datosRegistroUsuario);
    }
    public void crearLaborAcademica(){}
    public void crearPeriodoAcademico(){}
    public void notificarDocentes(){}
}
