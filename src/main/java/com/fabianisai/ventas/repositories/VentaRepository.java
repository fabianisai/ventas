package com.fabianisai.ventas.repositories;

import com.fabianisai.ventas.Services.CRUD;
import com.fabianisai.ventas.models.Venta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VentaRepository extends JpaRepository<Venta, Long> {
}
