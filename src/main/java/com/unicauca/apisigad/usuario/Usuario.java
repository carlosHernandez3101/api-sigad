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
    private String usuario;
    private String contrasenia;
    @OneToOne
    @JoinColumn(name = "docente_id")
    private Docente docente;
    private String rol;
    public Usuario(DatosRegistroUsuario datosRegistroUsuario) {
        this.usuario = datosRegistroUsuario.usuario();
        this.contrasenia = datosRegistroUsuario.contrasenia();
        this.rol = datosRegistroUsuario.rol();
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }
}
