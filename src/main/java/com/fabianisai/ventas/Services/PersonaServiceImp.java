package com.fabianisai.ventas.Services;

import com.fabianisai.ventas.models.Persona;
import com.fabianisai.ventas.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImp implements PersonaService {

    @Autowired
    private PersonaRepository personaRepository;

    @Override
    public Persona registrar(Persona persona) {
        return personaRepository.save(persona);
    }

    @Override
    public Persona modificar(Persona persona) {
        return personaRepository.save(persona);
    }

    @Override
    public Persona leer(Long id) {
        return personaRepository.getOne(id);
    }

    @Override
    public List<Persona> listar() {
        return (List<Persona>) personaRepository.findAll();
    }

    @Override
    public void eliminar(Long id) {
        personaRepository.deleteById(id);
    }
}
