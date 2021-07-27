package com.example.ejercicioapiproductos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EjercicioApiProductosApplication {

    public static void main(String[] args) {
        SpringApplication.run(EjercicioApiProductosApplication.class, args);
    }

    /*
    Crear una API que gestione el ciclo de vida de los productos de una tienda.

Los productos tienen: nombre:string, precio:double, stock:integer.

La API permite a todos los usuarios registrados:
- listar todos los productos
- listar un producto por ID
- listar todos los productos que contengan un string en el nombre

Además, los administradores pueden:
- modificar un producto existente
- crear nuevos productos
- eliminar un producto por ID

Utilizar autenticación básica en la API.
##Además, los administradores pueden:
####- modificar un producto existente   POST /api/productos/guardar
####- crear nuevos productos            PUT /api/productos/guardar
####- eliminar un producto por ID       DELETE /api/productos/{producto_id}

     */
}
