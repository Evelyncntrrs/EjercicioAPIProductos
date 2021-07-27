package com.example.ejercicioapiproductos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {

    private final ProductoRepository productoRepository;
@Autowired
    public ProductoService(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    public List<Producto> listarProductos() {
    return productoRepository.findAll();
    }

    public List<Producto> mostrarProductoPorId(Integer id) {
    return productoRepository.findAllById(id);
    }

    public List<Producto> mostrarProductoPorNombre(String nombre)    {
    return productoRepository.findProductoByNombreContaining(nombre);
    }

    public void save(Producto producto) {
        if (producto.getProductoId() != null) {
            Producto productoExistente = productoRepository.findById(producto.getProductoId()).orElse(null);
            if (productoExistente != null) {
                if (producto.getNombre() != null) productoExistente.setNombre(producto.getNombre());
                if (producto.getPrecio() != null) productoExistente.setPrecio(producto.getPrecio());
                if (producto.getStock() != null) productoExistente.setStock(producto.getStock());
                productoRepository.save(productoExistente);
            } else producto.setProductoId(null);
        }
        productoRepository.save(producto);
    }

    public void deleteById(Integer id)  {
        productoRepository.deleteById(id);
    }

}
