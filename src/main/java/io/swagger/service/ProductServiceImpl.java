package io.swagger.service;

import io.swagger.dto.Producto;
import io.swagger.mapper.ProductMapper;
import io.swagger.repository.ProductRepo;
import io.swagger.repository.entity.ProductoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductMapper mapper;

    @Autowired
    private ProductRepo repo;

    @Override
    public Producto crearProducto(Producto producto) {
        ProductoEntity entity =  mapper.dtoToEntity(producto);
        entity = repo.save(entity);
        return mapper.entityToDto(entity);
    }
}
