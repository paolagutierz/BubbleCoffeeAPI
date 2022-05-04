package io.swagger.mapper;

import io.swagger.dto.Pedido;
import io.swagger.repository.entity.PedidoEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PedidoMapper {
    PedidoEntity dtoToEntity(Pedido dto);

    Pedido entityToDto(PedidoEntity entity);

    List<Pedido> entityListToDtoList(List<PedidoEntity> entityList);

    List<PedidoEntity> dtoListToEntityList(List<Pedido> dtoList);

}
