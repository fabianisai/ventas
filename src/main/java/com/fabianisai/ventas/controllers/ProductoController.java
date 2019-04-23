package com.fabianisai.ventas.controllers;


import com.fabianisai.ventas.Services.PersonaService;
import com.fabianisai.ventas.Services.ProductoService;
import com.fabianisai.ventas.models.Persona;
import com.fabianisai.ventas.models.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @GetMapping()
    public List<Producto> listar(){
        return productoService.listar();
    }

    @GetMapping("/{id}")
    public Producto listarPorId(@PathVariable("id") Long id){
        return productoService.leer(id);
    }

    @PostMapping
    public Producto registrar(@RequestBody Producto producto) {
        return productoService.registrar(producto);
    }

    @PutMapping
    public Producto modificar(@RequestBody Producto producto) {
        return productoService.modificar(producto);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Long id) {
        productoService.eliminar(id);
    }


}
