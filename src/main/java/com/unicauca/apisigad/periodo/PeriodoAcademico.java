package com.unicauca.apisigad.periodo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Table(name = "periodoacademico")
@Entity(name = "Periodo")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@EqualsAndHashCode(of = "ID")
public class PeriodoAcademico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private Integer anio;
    private Integer semestre;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    public PeriodoAcademico(DatosRegistroPeriodo datosRegistroPeriodo) {
        this.nombre = datosRegistroPeriodo.nombre();
        this.anio = datosRegistroPeriodo.anio();
        this.semestre = datosRegistroPeriodo.semestre();
        this.fechaInicio = datosRegistroPeriodo.fechaInicio();
        this.fechaFin = datosRegistroPeriodo.fechaFin();
    }
    
}
