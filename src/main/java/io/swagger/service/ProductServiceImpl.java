package io.swagger.service;

import io.swagger.dto.ProductoDTO;
import io.swagger.mapper.ProductMapper;
import io.swagger.repository.ProductRepo;
import io.swagger.repository.entity.ProductoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper mapper;

    @Autowired
    private ProductRepo repo;

    @Override
    public ProductoDTO crearProducto(ProductoDTO productoDTO) {
        ProductoEntity entity = mapper.dtoToEntity(productoDTO);
        entity = repo.save(entity);
        return mapper.entityToDto(entity);
    }

    @Override
    public void eliminarProducto(int productoId) {
        repo.delete(productoId);
    }

    @Override
    public List<ProductoDTO> obtenerTodosLosProductos() {
        List<ProductoEntity> productos = repo.findAll();
        return mapper.entityListToDtoList(productos);
    }

    @Override
    public ProductoDTO obtenerProductoPorId(int id) {
        ProductoEntity producto = repo.findOne(id);
        return mapper.entityToDto(producto);
    }

    @Override
    public List<ProductoDTO> obtenerProductosPorCategoria(String categoria) {
        List<ProductoEntity> productos = repo.findByCategoria(categoria);
        return mapper.entityListToDtoList(productos);
    }

    @Override
    public ProductoDTO modificarProducto(int id, ProductoDTO productoDTO) {
        // obtener el producto
        ProductoEntity producto= repo.findOne(id);
        // modificamos todos los campos que vengan del dto, menos el id
        producto.setNombre(productoDTO.getNombre());
        producto.setCategoria(productoDTO.getCategoria().name());
        producto.setPrecio(productoDTO.getPrecio().doubleValue());
        producto.setDisponibilidad(productoDTO.getDisponibilidad().name());

        producto = repo.save(producto);
        return mapper.entityToDto(producto);
    }
}
