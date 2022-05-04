package io.swagger.mapper;

import io.swagger.dto.Producto;
import io.swagger.repository.entity.ProductoEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    ProductoEntity dtoToEntity(Producto dto);

    Producto entityToDto(ProductoEntity entity);

    List<Producto> entityListToDtoList(List<ProductoEntity> entityList);

    List<ProductoEntity> dtoListToEntityList(List<Producto> dtoList);
}
