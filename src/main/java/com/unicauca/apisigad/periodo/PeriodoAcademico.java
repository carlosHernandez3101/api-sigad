package com.unicauca.apisigad.periodo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.time.LocalDate;

@Table(name = "periodos")
@Entity(name = "Periodo")
@AllArgsConstructor
@Getter
@EqualsAndHashCode(of = "id")
public class PeriodoAcademico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
}
