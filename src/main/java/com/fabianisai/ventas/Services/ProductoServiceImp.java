package com.fabianisai.ventas.Services;

import com.fabianisai.ventas.models.Persona;
import com.fabianisai.ventas.models.Producto;
import com.fabianisai.ventas.repositories.PersonaRepository;
import com.fabianisai.ventas.repositories.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServiceImp implements ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public Producto registrar(Producto producto) {
        return productoRepository.save(producto);
    }

    @Override
    public Producto modificar(Producto producto) {
        return productoRepository.save(producto);
    }

    @Override
    public Producto leer(Long id) {
        return productoRepository.getOne(id);
    }

    @Override
    public List<Producto> listar() {
        return (List<Producto>) productoRepository.findAll();
    }

    @Override
    public void eliminar(Long id) {
        productoRepository.deleteById(id);
    }
}
