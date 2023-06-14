package com.unicauca.apisigad.labor;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Table(name = "labores")
@Entity(name = "Labor")
@AllArgsConstructor
@Getter
@EqualsAndHashCode(of = "id")
public class Labor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private Integer numeroHoras;
}
