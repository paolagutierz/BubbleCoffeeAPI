package io.swagger.service;

import io.swagger.dto.PedidoDTO;
import io.swagger.mapper.PedidoMapper;
import io.swagger.mapper.ProductMapper;
import io.swagger.repository.PedidoRepo;
import io.swagger.repository.ProductRepo;
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

    private DateTimeFormatter dateFormatter= DateTimeFormatter.ofPattern("dd/MM/yyyy");


    @Override
    public PedidoDTO crearPedido(List<Integer> productos) {
        PedidoEntity entity = new PedidoEntity();
        entity.setEstado(PedidoDTO.EstadoEnum.CREADO.name());
        entity.setFecha(dateFormatter.format(LocalDateTime.now()));

        List<ProductoEntity> productosEntity = new ArrayList<>();
        double precioTotal = 0.0;
        for (Integer productoId: productos) {
            ProductoEntity productoEntity= productRepo.findOne(productoId);
            productosEntity.add(productoEntity);
            precioTotal= precioTotal+ productoEntity.getPrecio();

        }
        entity.setProductos(productosEntity);
        entity.setCostoTotal(precioTotal);

        entity = pedidoRepo.save(entity);
        return pedidoMapper.entityToDto(entity);
    }

    @Override
    public void eliminarPedido(int pedidoId) {
            pedidoRepo.delete(pedidoId);
    }

    @Override
    public PedidoDTO obtenerPedidoPorId(int id) {
        PedidoEntity pedido = pedidoRepo.findOne(id);
        return pedidoMapper.entityToDto(pedido);
    }

    @Override
    public PedidoDTO modificarPedido(int id, List<Integer> productos) {
        PedidoEntity pedido= pedidoRepo.findOne(id);
        // modificamos todos los campos que vengan del dto, menos el id
        List<ProductoEntity> productosEntity = new ArrayList<>();
        double precioTotal = 0.0;
        for (Integer productoId: productos) {
            ProductoEntity productoEntity= productRepo.findOne(productoId);
            productosEntity.add(productoEntity);
            precioTotal= precioTotal+ productoEntity.getPrecio();

        }
        pedido.setProductos(productosEntity);
        pedido.setCostoTotal(precioTotal);

        pedido = pedidoRepo.save(pedido);
        return pedidoMapper.entityToDto(pedido);
    }

}


