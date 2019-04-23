package com.fabianisai.ventas.Services;

import com.fabianisai.ventas.models.DetalleVenta;
import com.fabianisai.ventas.models.Venta;
import com.fabianisai.ventas.repositories.VentaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class VentaServiceImp implements VentaService {

    Logger logger =  LoggerFactory.getLogger(VentaServiceImp.class);

    @Autowired
    private VentaRepository ventaRepository;

    @Transactional
    @Override
    public Venta registrar(Venta venta) {

       // logger.info(venta.toString());
        Double importeTemp=0.00;
      //  logger.info(venta.getDetalleVenta().toString());
      //  venta.getDetalleVenta().forEach(det -> det.setVenta(venta));

        for (DetalleVenta det : venta.getDetalleVenta()){
            logger.info(det.toString());
            det.setVenta(venta);
            importeTemp = importeTemp + (det.getCantidad() * det.getProducto().getPrecio());
        }

        venta.setImporte(importeTemp);
  
        return ventaRepository.save(venta);

    }

    @Override
    public Venta modificar(Venta venta) {
        return ventaRepository.save(venta);
    }

    @Override
    public Venta leer(Long id) {
        return ventaRepository.getOne(id);
    }

    @Override
    public List<Venta> listar() {
        return ventaRepository.findAll();
    }

    @Override
    public void eliminar(Long id) {
        ventaRepository.deleteById(id);
    }
}
