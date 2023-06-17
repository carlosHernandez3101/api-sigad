package com.unicauca.apisigad.usuario;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DatosRegistroUsuario(
        @NotBlank
        String usuario,
        @NotBlank
        String contrasenia,
        String rol,
        @NotNull
        Long docente_id){
}
