package com.unicauca.apisigad.labor;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Table(name = "tiposLabores")
@Entity(name = "TipoLabor")
@AllArgsConstructor
@Getter
@EqualsAndHashCode(of = "id")
public class TipoLabor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String codigo;
    private String descripcion;
}
