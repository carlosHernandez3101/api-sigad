package com.unicauca.apisigad.usuario;

import com.unicauca.apisigad.docente.Docente;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Table(name = "usuarios")
@Entity(name = "usuario")
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

    public Usuario(DatosRegistroUsuario datosRegistroUsuario) {
        this.username = datosRegistroUsuario.username();
        this.password = datosRegistroUsuario.password();
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }
}
