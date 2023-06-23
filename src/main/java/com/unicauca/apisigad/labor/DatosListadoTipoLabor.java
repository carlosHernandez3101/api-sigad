package com.unicauca.apisigad.labor;

public record DatosListadoTipoLabor(Long id, String codigo, String descripcion) {
    public DatosListadoTipoLabor(TipoLabor tipoLabor){
        this(tipoLabor.getId(), tipoLabor.getCodigo(), tipoLabor.getDescripcion());
    }
}
