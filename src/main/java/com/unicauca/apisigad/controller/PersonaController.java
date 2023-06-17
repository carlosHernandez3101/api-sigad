package com.unicauca.apisigad.controller;

import com.unicauca.apisigad.docente.DatosRegistroDocente;
import com.unicauca.apisigad.docente.DocenteRepository;
import com.unicauca.apisigad.persona.DatosRegistroPersona;
import com.unicauca.apisigad.persona.Persona;
import com.unicauca.apisigad.persona.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/persona")
public class PersonaController {

    @Autowired
    private PersonaRepository docenteRepository;

    @PostMapping
    public void addPersona(@RequestBody DatosRegistroPersona datosRegistroPersona){
        docenteRepository.save(new Persona(datosRegistroPersona));
    }
}
