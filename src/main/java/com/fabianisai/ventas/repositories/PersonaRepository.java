package com.fabianisai.ventas.repositories;

import com.fabianisai.ventas.models.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface PersonaRepository extends JpaRepository<Persona, Long> {


}
