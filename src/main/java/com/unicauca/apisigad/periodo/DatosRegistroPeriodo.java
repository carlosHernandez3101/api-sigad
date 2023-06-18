package com.unicauca.apisigad.periodo;

import java.time.LocalDate;

import jakarta.validation.constraints.NotBlank;

public record DatosRegistroPeriodo(
    @NotBlank
    String nombre,
    @NotBlank
    Integer anio,
    @NotBlank
    Integer semestre,
    @NotBlank
    LocalDate fechaInicio,
    @NotBlank
    LocalDate fechaFin){
}
