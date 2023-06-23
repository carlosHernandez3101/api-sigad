package com.unicauca.apisigad.docente;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record DatosRespuestaDocente(
        Long id,
        String nombres,
        String apellidos,
        String tipoIdentificacion,
        String identificacion,
        String tipoDocente,
        String correoInstitucional,
        String ultimoTituloAcademico) {
}
