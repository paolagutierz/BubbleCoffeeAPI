package io.swagger.service;

import io.swagger.dto.ProductoDTO;

import java.util.List;

public interface ProductService {

    ProductoDTO crearProducto(ProductoDTO productoDTO);

    void eliminarProducto(int id);

    List<ProductoDTO> obtenerTodosLosProductos();

    ProductoDTO obtenerProductoPorId(int id);

    List<ProductoDTO> obtenerProductosPorCategoria(List<String> categorias);

    ProductoDTO modificarProducto(int id, ProductoDTO productoDTO);
}
