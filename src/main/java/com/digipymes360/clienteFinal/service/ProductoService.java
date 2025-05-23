package com.digipymes360.clienteFinal.service;

import com.digipymes360.clienteFinal.model.Producto;
import com.digipymes360.clienteFinal.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    public List<Producto> buscarPorNombre(String nombre) {
        return productoRepository.findByNombreContainingIgnoreCase(nombre);
    }

    public List<Producto> filtrarPorPrecio(Double min, Double max) {
        return productoRepository.findByPrecioBetween(min, max);
    }

    public List<Producto> disponibles(Integer minimoStock) {
        return productoRepository.findByStockGreaterThan(minimoStock);
    }

    public List<Producto> porNegocio(Integer idNegocio) {
        return productoRepository.findByNegocioIdNegocio(idNegocio);
    }

    public List<Producto> listarTodos() {
        return productoRepository.findAll();
    }
}
