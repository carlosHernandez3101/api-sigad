package com.unicauca.apisigad.docente;

import jakarta.validation.constraints.NotBlank;

public record DatosActualizarDocente(
        @NotBlank
        Long id,
        String nombres,
        String apellidos,
        String correoInstitucional) {
}
