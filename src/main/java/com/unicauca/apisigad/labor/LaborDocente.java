package com.unicauca.apisigad.labor;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "labores_docentes")
@Entity(name = "LaborDocente")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@EqualsAndHashCode(of = "id")
public class LaborDocente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private Integer horas_asignadas;

    private String descripcion;
    @OneToOne
    @JoinColumn(name = "tipo_labor_id")
    private TipoLabor tipoLabor;

    public LaborDocente(DatosRegistroLaborDocente datosRegistroLaborDocente) {
        this.nombre = datosRegistroLaborDocente.nombre();
        this.horas_asignadas = datosRegistroLaborDocente.numeroHoras();
        this.descripcion = datosRegistroLaborDocente.descripcion();
    }

    public void setTipoLabor(TipoLabor tipoLabor) {
        this.tipoLabor = tipoLabor;
    }
}
