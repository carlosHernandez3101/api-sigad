package com.unicauca.apisigad.docente;

import com.unicauca.apisigad.usuario.DatosRegistroUsuario;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record DatosRegistroDocente(
        @NotBlank
        String nombres,
        @NotBlank
        String apellidos,
        String tipoIdentificacion,
        String identificacion,
        String tipoDocente,
        @Email
        String correoInstitucional,
        String ultimoTituloAcademico,

        DatosRegistroUsuario datosRegistroUsuario) {
}
