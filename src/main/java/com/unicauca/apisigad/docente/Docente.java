package com.unicauca.apisigad.docente;

import com.unicauca.apisigad.usuario.Usuario;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;


@Table(name = "docentes")
@Entity(name = "Docente")
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

    @Embedded
    @OneToOne(mappedBy = "docente", cascade = CascadeType.ALL)
    private Usuario usuario;

}
