package com.unicauca.apisigad.facade;

import com.unicauca.apisigad.docente.DatosRegistroDocente;
import com.unicauca.apisigad.docente.Docente;
import com.unicauca.apisigad.docente.DocenteService;
import com.unicauca.apisigad.labor.*;
import com.unicauca.apisigad.periodo.DatosRegistroPeriodo;
import com.unicauca.apisigad.periodo.PeriodoAcademico;
import com.unicauca.apisigad.periodo.PeriodoAcademicoRepository;
import com.unicauca.apisigad.periodo.PeriodoAcademicoService;
import com.unicauca.apisigad.usuario.DatosRegistroUsuario;
import com.unicauca.apisigad.usuario.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SIGADFacade {
    @Autowired
    private DocenteService docenteService;
    @Autowired
    private UsuarioService usuarioService;
    @Autowired
    private PeriodoAcademicoService periodoService;
    @Autowired
    private PeriodoAcademicoRepository periodoRepository;

    @Autowired
    private TipoLaborService tipoLaborService;

    @Autowired
    private LaborDocenteService laborDocenteService;

    public void realizarEvaluacion() {
    }

    public void registrarDocente(DatosRegistroDocente datosRegistroDocente) {
        System.out.println("sigadFacade registrar");
        docenteService.registrarDocente(datosRegistroDocente);
    }

    public void asignarUsuario(DatosRegistroUsuario datosRegistroUsuario) {
        System.out.println("sigadFacade asignar");
        Docente docente = docenteService.obtenerDocenteById(datosRegistroUsuario.docente_id());
        usuarioService.crearUsuario(docente, datosRegistroUsuario);
    }

    public void crearTipoLaborAcademica(DatosRegistroTipoLabor datosRegistroTipoLabor) {
        System.out.println("sigadFacade crear tipo labor");
        tipoLaborService.crearTipoLabor(datosRegistroTipoLabor);
    }

    public void crearLaborDocente(DatosRegistroLaborDocente datosRegistroLaborDocente){
        System.out.println("sigadFacade crear labor docente");
        TipoLabor tipoLabor = tipoLaborService.obtenerTipoLaborById(datosRegistroLaborDocente.tipoLabor_id());
        laborDocenteService.createLaborDocente(tipoLabor, datosRegistroLaborDocente);
    }

    public PeriodoAcademico crearPeriodoAcademico(DatosRegistroPeriodo datosRegistroPeriodo) {
        System.out.println("sigadFacade registrar Periodo Academico");
        return periodoService.registrarPerido(datosRegistroPeriodo);
    }

    public Iterable<PeriodoAcademico> findAllPeriodos() {
        System.out.println("sigadFacade listar Periodo Academico");
        return periodoRepository.findAll();
    }

    public void notificarDocentes() {
    }
}
