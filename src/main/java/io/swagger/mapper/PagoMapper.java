package io.swagger.mapper;

import io.swagger.dto.PagoDTO;
import io.swagger.dto.PedidoDTO;
import io.swagger.dto.ProductoDTO;
import io.swagger.repository.entity.PagoEntity;
import io.swagger.repository.entity.PedidoDetalleEntity;
import io.swagger.repository.entity.PedidoEntity;
import io.swagger.repository.entity.ProductoEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Mapper(componentModel = "spring")
public interface PagoMapper {

    PagoEntity dtoToEntity(PagoDTO dto);

    @Mapping(target="pedido",expression="java(getPedido(entity.getPedido()))")
    PagoDTO entityToDto(PagoEntity entity);


    List<PagoDTO> entityListToDtoList(List<PagoEntity> entityList);

    default PedidoDTO getPedido(PedidoEntity entity){
        PedidoDTO pedidoDTO = new PedidoDTO();
        if ( entity.getId() != null ) {
            pedidoDTO.setId( String.valueOf( entity.getId() ) );
        }
        pedidoDTO.setCostoTotal( BigDecimal.valueOf( entity.getCostoTotal() ) );
        if ( entity.getEstado() != null ) {
            pedidoDTO.setEstado( Enum.valueOf( PedidoDTO.EstadoEnum.class, entity.getEstado() ) );
        }
        pedidoDTO.setFecha( entity.getFecha() );

        List<ProductoDTO> productos= new ArrayList<>();
        for(PedidoDetalleEntity pedido:entity.getPedidoDetalleList()){
            ProductoEntity productoEntity= pedido.getProductoEntity();

            ProductoDTO productoDTO = new ProductoDTO();

            if ( productoEntity.getCategoria() != null ) {
                productoDTO.setCategoria( Enum.valueOf( ProductoDTO.CategoriaEnum.class, productoEntity.getCategoria() ) );
            }
            if ( productoEntity.getDisponibilidad() != null ) {
                productoDTO.setDisponibilidad( Enum.valueOf( ProductoDTO.DisponibilidadEnum.class, productoEntity.getDisponibilidad() ) );
            }
            if ( productoEntity.getId() != null ) {
                productoDTO.setId( productoEntity.getId().longValue() );
            }
            productoDTO.setNombre( productoEntity.getNombre() );
            productoDTO.setPrecio( BigDecimal.valueOf( productoEntity.getPrecio() ) );

            productos.add(productoDTO);
        }
        pedidoDTO.setProductos(productos);

        return pedidoDTO;
    }

}
