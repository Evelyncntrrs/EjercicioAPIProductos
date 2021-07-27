package com.example.ejercicioapiproductos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductoRepository extends JpaRepository<Producto,Integer> {

    List<Producto> findAllById(Integer id);

    List<Producto> findProductoByNombreContaining(String nombre);
}
