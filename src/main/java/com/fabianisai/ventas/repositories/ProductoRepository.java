package com.fabianisai.ventas.repositories;

import com.fabianisai.ventas.models.Persona;
import com.fabianisai.ventas.models.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
