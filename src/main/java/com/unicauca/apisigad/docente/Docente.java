package com.unicauca.apisigad.docente;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Table(name = "docentes")
@Entity(name = "docente")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@EqualsAndHashCode(of = "id")
public class Docente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombres;
    private String apellidos;
    private String tipo_identificacion;
    private String identificacion;
    private String tipo_docente;
    private String correo_institucional;
    private String ultimo_titulo_academico;

    public Docente(DatosRegistroDocente datosRegistroDocente) {
        this.nombres = datosRegistroDocente.nombres();
        this.apellidos = datosRegistroDocente.apellidos();
        this.tipo_identificacion = datosRegistroDocente.tipoIdentificacion();
        this.identificacion = datosRegistroDocente.identificacion();
        this.tipo_docente = datosRegistroDocente.tipoDocente();
        this.correo_institucional = datosRegistroDocente.correoInstitucional();
        this.ultimo_titulo_academico = datosRegistroDocente.ultimoTituloAcademico();
    }

}
