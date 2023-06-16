package com.unicauca.apisigad.docente;

import com.unicauca.apisigad.usuario.Usuario;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;


@Table(name = "docentes")
@Entity(name = "docente")
@AllArgsConstructor
@Getter
@EqualsAndHashCode(of = "id")
public class Docente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombres;
    private String apellidos;
    private String tipoIdentificacion;
    private String identificacion;
    private String tipoDocente;
    private String correoInstitucional;
    private String ultimoTituloAcademico;
    @OneToOne(mappedBy = "docente", cascade = CascadeType.ALL)
    private Usuario usuario;

    public Docente(DatosRegistroDocente datosRegistroDocente) {
        this.nombres = datosRegistroDocente.nombres();
        this.apellidos = datosRegistroDocente.apellidos();
        this.tipoIdentificacion = datosRegistroDocente.tipoIdentificacion();
        this.identificacion = datosRegistroDocente.identificacion();
        this.tipoDocente = datosRegistroDocente.tipoDocente();
        this.correoInstitucional = datosRegistroDocente.correoInstitucional();
        this.ultimoTituloAcademico = datosRegistroDocente.ultimoTituloAcademico();
        this.usuario = new Usuario(datosRegistroDocente.usuario());
    }

}
