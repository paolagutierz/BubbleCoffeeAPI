package io.swagger.mapper;

import io.swagger.dto.PedidoDTO;
import io.swagger.dto.ProductoDTO;
import io.swagger.repository.entity.PedidoDetalleEntity;
import io.swagger.repository.entity.PedidoEntity;
import io.swagger.repository.entity.ProductoEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Mapper(componentModel = "spring")
public interface PedidoMapper {
    PedidoEntity dtoToEntity(PedidoDTO dto);

    @Mapping(target="productos",expression="java(getProductos(entity.getPedidoDetalleList()))")
    PedidoDTO entityToDto(PedidoEntity entity);

    List<PedidoDTO> entityListToDtoList(List<PedidoEntity> entityList);

    default List<ProductoDTO> getProductos(List<PedidoDetalleEntity> list){
        List<ProductoDTO> productos= new ArrayList<>();
        for(PedidoDetalleEntity pedido:list){
            ProductoEntity entity= pedido.getProductoEntity();

            ProductoDTO productoDTO = new ProductoDTO();

            if ( entity.getCategoria() != null ) {
                productoDTO.setCategoria( Enum.valueOf( ProductoDTO.CategoriaEnum.class, entity.getCategoria() ) );
            }
            if ( entity.getDisponibilidad() != null ) {
                productoDTO.setDisponibilidad( Enum.valueOf( ProductoDTO.DisponibilidadEnum.class, entity.getDisponibilidad() ) );
            }
            if ( entity.getId() != null ) {
                productoDTO.setId( entity.getId().longValue() );
            }
            productoDTO.setNombre( entity.getNombre() );
            productoDTO.setPrecio( BigDecimal.valueOf( entity.getPrecio() ) );

            productos.add(productoDTO);
        }
        return productos;
    }
}
