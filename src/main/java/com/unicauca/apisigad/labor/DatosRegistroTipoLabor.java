package com.unicauca.apisigad.labor;

import jakarta.validation.constraints.NotBlank;

public record DatosRegistroTipoLabor(
        @NotBlank
        String codigo,
        @NotBlank
        String descripcion) {
}
