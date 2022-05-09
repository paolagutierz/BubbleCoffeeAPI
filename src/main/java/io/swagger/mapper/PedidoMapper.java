package io.swagger.mapper;

import io.swagger.dto.PedidoDTO;
import io.swagger.repository.entity.PedidoEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PedidoMapper {
    PedidoEntity dtoToEntity(PedidoDTO dto);

    PedidoDTO entityToDto(PedidoEntity entity);

    List<PedidoDTO> entityListToDtoList(List<PedidoEntity> entityList);
}
