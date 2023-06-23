package com.unicauca.apisigad.facade;

import com.unicauca.apisigad.docente.*;
import com.unicauca.apisigad.labor.*;
import com.unicauca.apisigad.periodo.DatosRegistroPeriodo;
import com.unicauca.apisigad.periodo.PeriodoAcademico;
import com.unicauca.apisigad.periodo.PeriodoAcademicoRepository;
import com.unicauca.apisigad.periodo.PeriodoAcademicoService;
import com.unicauca.apisigad.usuario.DatosRegistroUsuario;
import com.unicauca.apisigad.usuario.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
    private DocenteRepository docenteRepository;

    @Autowired
    private TipoLaborService tipoLaborService;

    @Autowired
    private LaborDocenteService laborDocenteService;

    public void realizarEvaluacion() {
    }
    public void registrarDocente(DatosRegistroDocente datosRegistroDocente) {
        docenteService.registrarDocente(datosRegistroDocente);
    }
    public void asignarUsuario(DatosRegistroUsuario datosRegistroUsuario) {
        Docente docente = docenteService.obtenerDocenteById(datosRegistroUsuario.docente_id());
        usuarioService.crearUsuario(docente, datosRegistroUsuario);
    }
    public Iterable<Docente> findAllDocentes() {
        System.out.println("sigadFacade listar docentes");
        return docenteRepository.findAll();
    }
    public DatosRespuestaDocente mostrarDatosDocente(Long id){
        return docenteService.mostrarDatosDocenteById(id);
    }
    public void inactivarDocente(Long id) {
        docenteService.inactivarDocente(id);
    }
    public void actualizarDatosDocente(DatosActualizarDocente datosActualizarDocente){
        docenteService.actualizarDocente(datosActualizarDocente);
    }
    public void crearTipoLaborAcademica(DatosRegistroTipoLabor datosRegistroTipoLabor) {
        System.out.println("sigadFacade crear tipo labor");
        tipoLaborService.crearTipoLabor(datosRegistroTipoLabor);
    }
    public List<DatosListadoTipoLabor> listarTipoLabores(){
        return tipoLaborService.listarTiposLabores();
    }
    public void inactivarTipoLabor(Long id){
        tipoLaborService.inactivarTipoLabor(id);
    }
    public void crearLaborDocente(DatosRegistroLaborDocente datosRegistroLaborDocente){
        System.out.println("sigadFacade crear labor docente");
        TipoLabor tipoLabor = tipoLaborService.obtenerTipoLaborById(datosRegistroLaborDocente.tipoLabor_id());
        laborDocenteService.crearLaborDocente(tipoLabor, datosRegistroLaborDocente);
    }
    public List<DatosListadoLaborDocente> listarLaboresDocente() {
        return laborDocenteService.listarLaboresDocentes();
    }
    public void inactivarLaborDocente(Long id){
        laborDocenteService.inactivarLaborDocente(id);
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
