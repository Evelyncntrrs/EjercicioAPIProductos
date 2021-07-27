package com.example.ejercicioapiproductos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {
    private final ProductoService productoService;

@Autowired
    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }

    @GetMapping
    public List<Producto> listarProductos(){
    return productoService.listarProductos();
    }

    @GetMapping("/{id}")
    public List<Producto> mostrarProductoPorId(Integer id)    {
    return productoService.mostrarProductoPorId(id);
    }

    @GetMapping("/{nombre}")
    public List<Producto> mostrarProductoPornombre(String nombre)    {
        return productoService.mostrarProductoPorNombre(nombre);
    }

   /* @PostMapping("/guardar")
    public boolean editarProducto(Integer id){
    return  productoService.editarProducto(id);
    }

    */



}
