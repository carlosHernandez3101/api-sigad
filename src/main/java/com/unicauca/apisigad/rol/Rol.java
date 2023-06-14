package com.unicauca.apisigad.rol;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Table(name = "roles")
@Entity(name = "Rol")
@AllArgsConstructor
@Getter
@EqualsAndHashCode(of = "id")
public class Rol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descripcion;

}
