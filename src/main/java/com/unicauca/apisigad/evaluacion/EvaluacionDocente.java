package com.unicauca.apisigad.evaluacion;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Table(name = "evalucionesDocentes")
@Entity(name = "EvaluacionDocente")
@AllArgsConstructor
@Getter
@EqualsAndHashCode(of = "id")
public class EvaluacionDocente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String estado;
    private Integer puntaje;
    private String resultado;
}
