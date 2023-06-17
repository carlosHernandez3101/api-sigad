package com.unicauca.apisigad.persona;

import jakarta.validation.constraints.NotBlank;

public record DatosRegistroPersona(
        @NotBlank
        String nombres,
        @NotBlank
        String apellidos,
        @NotBlank
        String correo_institucional
) {
}
