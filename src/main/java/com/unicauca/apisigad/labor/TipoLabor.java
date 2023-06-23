package com.unicauca.apisigad.labor;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "tiposLabores")
@Entity(name = "TipoLabor")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@EqualsAndHashCode(of = "id")
@Embeddable
public class TipoLabor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String codigo;
    private String descripcion;
    private Boolean activo;

    public TipoLabor(DatosRegistroTipoLabor datosRegistroTipoLabor) {
        this.activo = true;
        this.codigo = datosRegistroTipoLabor.codigo();
        this.descripcion = datosRegistroTipoLabor.descripcion();
    }
    public void actualizarTipoLabor(){

    }
    public void inactivarTipoLabor(){
        this.activo = false;
    }
}
