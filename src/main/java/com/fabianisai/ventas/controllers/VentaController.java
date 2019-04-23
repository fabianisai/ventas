package com.fabianisai.ventas.controllers;


import com.fabianisai.ventas.Services.ProductoService;
import com.fabianisai.ventas.Services.VentaService;
import com.fabianisai.ventas.Services.VentaServiceImp;
import com.fabianisai.ventas.models.Producto;
import com.fabianisai.ventas.models.Venta;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ventas")
public class VentaController {


    @Autowired
    private VentaService ventaService;

    @GetMapping()
    public List<Venta> listar(){
        return ventaService.listar();
    }

    @GetMapping("/{id}")
    public Venta listarPorId(@PathVariable("id") Long id){
        return ventaService.leer(id);
    }

    @PostMapping
    public Venta registrar(@RequestBody Venta venta) {
        return ventaService.registrar(venta);
    }

    @PutMapping
    public Venta modificar(@RequestBody Venta venta) {
        return ventaService.modificar(venta);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Long id) {
        ventaService.eliminar(id);
    }


}
