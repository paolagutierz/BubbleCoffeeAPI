package io.swagger.mapper;

import io.swagger.dto.ProductoDTO;
import io.swagger.repository.entity.ProductoEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    ProductoEntity dtoToEntity(ProductoDTO dto);

    ProductoDTO entityToDto(ProductoEntity entity);

    List<ProductoDTO> entityListToDtoList(List<ProductoEntity> entityList);
}
