package com.unicauca.apisigad.controller;

import com.unicauca.apisigad.docente.*;
import com.unicauca.apisigad.facade.SIGADFacade;
import com.unicauca.apisigad.labor.DatosListadoLaborDocente;
import com.unicauca.apisigad.labor.DatosListadoTipoLabor;
import com.unicauca.apisigad.labor.DatosRegistroLaborDocente;
import com.unicauca.apisigad.labor.DatosRegistroTipoLabor;
import com.unicauca.apisigad.periodo.DatosRegistroPeriodo;
import com.unicauca.apisigad.periodo.PeriodoAcademico;

import com.unicauca.apisigad.usuario.DatosRegistroUsuario;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sigadGestion")
public class SIGADController {

    @Autowired
    private SIGADFacade sigadGestion;
    @PostMapping("/registrarDocente")
    public void registrarDocente(@RequestBody DatosRegistroDocente datosRegistroDocente) {
        sigadGestion.registrarDocente(datosRegistroDocente);
    }
    @PutMapping("/actualizarDocente")
    @Transactional
    public void actualizarDatosDocente(@RequestBody DatosActualizarDocente datosActualizarDocente){
        sigadGestion.actualizarDatosDocente(datosActualizarDocente);
    }
    @GetMapping("/listarDocentes")
    @ResponseBody
    public Iterable<Docente> obtenerDocentes() {
        Iterable<Docente> docentes = sigadGestion.findAllDocentes();
        return docentes;
    }
    @GetMapping("/mostrarDatosDocente/{id}")
    public DatosRespuestaDocente mostrarDatosDocente(@PathVariable Long id){
        return sigadGestion.mostrarDatosDocente(id);
    }
    @DeleteMapping("/inactivarDocente/{id}")
    @Transactional
    public void inactivarDocente(@PathVariable Long id){
        sigadGestion.inactivarDocente(id);
    }
    @PostMapping("/asignarUsuario")
    public void asignarUsuario(@RequestBody DatosRegistroUsuario datosRegistroUsuario) {
        System.out.println("sigadController - Asignar Usuario");
        sigadGestion.asignarUsuario(datosRegistroUsuario);
    }
    @PostMapping("/crearPeriodo")
    public PeriodoAcademico crearPeriodoAcademico(@RequestBody DatosRegistroPeriodo datosRegistroPeriodo) {
        System.out.println("sigadController - Asignar Periodo");
        return sigadGestion.crearPeriodoAcademico(datosRegistroPeriodo);
    }
    @GetMapping("/listarPeriodos")
    @ResponseBody
    public Iterable<PeriodoAcademico> obtenerPeriodos() {
        Iterable<PeriodoAcademico> periodos = sigadGestion.findAllPeriodos();
        return periodos;
    }
    @PostMapping("/registrarTipoLabor")
    public void registrarTipoLabor(@RequestBody DatosRegistroTipoLabor datosRegistroTipoLabor) {
        System.out.println("sigadController - Registrar TipoLabor");
        sigadGestion.crearTipoLaborAcademica(datosRegistroTipoLabor);
    }
    @GetMapping("/listarTiposLabor")
    public List<DatosListadoTipoLabor> listarTiposLabores(){
        return sigadGestion.listarTipoLabores();
    }
    @DeleteMapping("/inactivarTipoLabor/{id}")
    @Transactional
    public void inactivarTipoLabor(@PathVariable Long id){
        sigadGestion.inactivarTipoLabor(id);
    }
    @PostMapping("/registrarLaborDocente")
    public void registrarLaborDocente(@RequestBody DatosRegistroLaborDocente datosRegistroLaborDocente) {
        sigadGestion.crearLaborDocente(datosRegistroLaborDocente);
    }
    @GetMapping("/listarLaboresDocentes")
    public List<DatosListadoLaborDocente> listarLaboresDocentes(){
        return sigadGestion.listarLaboresDocente();
    }
    @DeleteMapping("/inactivarLaborDocente/{id}")
    public void inactivarLaborDocente(@PathVariable Long id){
        sigadGestion.inactivarLaborDocente(id);
    }

}
