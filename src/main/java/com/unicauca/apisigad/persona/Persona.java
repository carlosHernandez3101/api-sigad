package com.unicauca.apisigad.persona;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Table(name = "personas")
@Entity
@AllArgsConstructor
@Getter
@EqualsAndHashCode(of = "id")
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombres;
    private String apellidos;

    private String correo_institucional;
    public Persona(DatosRegistroPersona datosRegistroPersona){
        this.nombres = datosRegistroPersona.nombres();
        this.apellidos = datosRegistroPersona.apellidos();
        this.correo_institucional = datosRegistroPersona.correo_institucional();
    }

}
