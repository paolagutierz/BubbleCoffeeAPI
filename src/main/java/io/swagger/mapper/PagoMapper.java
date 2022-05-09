package io.swagger.mapper;

import io.swagger.dto.PagoDTO;
import io.swagger.repository.entity.PagoEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PagoMapper {

    PagoEntity dtoToEntity(PagoDTO dto);

    PagoDTO entityToDto(PagoEntity entity);

    List<PagoDTO> entityListToDtoList(List<PagoEntity> entityList);
}
