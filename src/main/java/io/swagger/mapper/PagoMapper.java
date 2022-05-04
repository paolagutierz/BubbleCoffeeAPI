package io.swagger.mapper;

import io.swagger.dto.Pago;
import io.swagger.repository.entity.PagoEntity;
import org.mapstruct.Mapper;

import java.util.List;


    @Mapper(componentModel = "spring")
    public interface PagoMapper {

        PagoEntity dtoToEntity(Pago dto);

        Pago entityToDto(PagoEntity entity);

        List<Pago> entityListToDtoList(List<PagoEntity> entityList);

        List<PagoEntity> dtoListToEntityList(List<Pago> dtoList);
}
