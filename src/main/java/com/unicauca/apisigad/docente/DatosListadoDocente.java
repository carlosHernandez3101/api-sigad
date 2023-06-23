package com.unicauca.apisigad.docente;

public record DatosListadoDocente(
        String nombres,
        String apellidos,
        String identificacion,
        String tipoDocente,
        String ultimoTituloAlcanzado) {

    public DatosListadoDocente(Docente docente){
        this(docente.getNombres(), docente.getApellidos(), docente.getIdentificacion(), docente.getTipo_docente(), docente.getUltimo_titulo_academico());
    }
}
