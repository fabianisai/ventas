package com.fabianisai.ventas.controllers;


import com.fabianisai.ventas.Services.PersonaService;
import com.fabianisai.ventas.models.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/personas")
public class PersonaController {

    @Autowired
    private PersonaService personaService;

    @GetMapping()
    public List<Persona> listar(){
        return personaService.listar();
    }

    @GetMapping("/{id}")
    public Persona listarPorId(@PathVariable("id") Long id){
        return personaService.leer(id);
    }

    @PostMapping
    public Persona registrar(@RequestBody Persona persona) {
        return personaService.registrar(persona);
    }

    @PutMapping
    public Persona modificar(@RequestBody Persona persona) {
        return personaService.modificar(persona);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Long id) {
        personaService.eliminar(id);
    }


}
