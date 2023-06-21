package com.unicauca.apisigad.labor;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotBlank;

public record DatosRegistroLaborDocente(
        @NotBlank
        String nombre,
        @NotBlank
        Integer numeroHoras,
        @NotBlank
        String descripcion,
        @NotBlank
        Long tipoLabor_id){
}
