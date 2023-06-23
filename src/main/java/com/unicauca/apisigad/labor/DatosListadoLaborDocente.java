package com.unicauca.apisigad.labor;

public record DatosListadoLaborDocente(
        Long id,
        String nombre,
        Integer numeroHoras,
        String descripcion,
        String tipoLaborDescripcion){
    public DatosListadoLaborDocente(LaborDocente laborDocente){
        this(laborDocente.getId(), laborDocente.getNombre(), laborDocente.getHoras_asignadas(), laborDocente.getDescripcion(), laborDocente.getTipoLabor().getDescripcion());
    }
}
