package io.swagger.service;

import io.swagger.dto.PedidoDTO;
import io.swagger.mapper.PedidoMapper;
import io.swagger.mapper.ProductMapper;
import io.swagger.repository.PedidoDetalleRepo;
import io.swagger.repository.PedidoRepo;
import io.swagger.repository.ProductRepo;
import io.swagger.repository.entity.PedidoDetalleEntity;
import io.swagger.repository.entity.PedidoEntity;
import io.swagger.repository.entity.ProductoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;


@Service
public class PedidoServiceImpl implements PedidoService {

    @Autowired
    private PedidoMapper pedidoMapper;

    @Autowired
    private ProductMapper productMapper;

    @Autowired
    private PedidoRepo pedidoRepo;

    @Autowired
    private ProductRepo productRepo;

    @Autowired
    private PedidoDetalleRepo pedidoDetalleRepo;

    private DateTimeFormatter dateFormatter= DateTimeFormatter.ofPattern("dd/MM/yyyy");


    @Override
    public PedidoDTO crearPedido(List<Integer> productos) {
        PedidoEntity entity = new PedidoEntity();
        entity.setEstado(PedidoDTO.EstadoEnum.CREADO.name());
        entity.setFecha(dateFormatter.format(LocalDateTime.now()));

        List<PedidoDetalleEntity> pedidoDetalleEntities = new ArrayList<>();
        double precioTotal = 0.0;
        for (Integer productoId: productos) {
            //obtener pedido del repo
            ProductoEntity productoEntity= productRepo.findOne(productoId);

            PedidoDetalleEntity pedidoDetalleEntity=new PedidoDetalleEntity();
            pedidoDetalleEntity.setProductoEntity(productoEntity); //set producto entity al pedido detalle entity
            pedidoDetalleEntity.setPedidoEntity(entity);//el pedidoentity lo estamos creando con el pedidodetalle

            pedidoDetalleEntities.add(pedidoDetalleEntity);
            precioTotal= precioTotal+ productoEntity.getPrecio();
        }

        entity.setPedidoDetalleList(pedidoDetalleEntities);
        entity.setCostoTotal(precioTotal);

        entity = pedidoRepo.save(entity);
        return pedidoMapper.entityToDto(entity);
    }

    @Override
    public void eliminarPedido(int pedidoId) {
        PedidoEntity pedidoEntity= pedidoRepo.findOne(pedidoId);
        pedidoEntity.setEstado(PedidoDTO.EstadoEnum.CANCELADO.name());
        pedidoRepo.save(pedidoEntity);
    }


    @Override
    public PedidoDTO obtenerPedidoPorId(int id) {
        PedidoEntity pedido = pedidoRepo.findOne(id);
        return pedidoMapper.entityToDto(pedido);
    }

}


