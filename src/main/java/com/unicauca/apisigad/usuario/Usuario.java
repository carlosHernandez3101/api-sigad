package com.unicauca.apisigad.usuario;

import com.unicauca.apisigad.docente.Docente;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Table(name = "usuarios")
@Entity(name = "Usuario")
@AllArgsConstructor
@Getter
@EqualsAndHashCode(of = "id")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;

    @Embedded
    @OneToOne
    @JoinColumn(name = "docente_id")
    private Docente docente;
}
