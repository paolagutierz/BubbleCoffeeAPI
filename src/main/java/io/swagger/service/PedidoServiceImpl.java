package io.swagger.service;

import io.swagger.dto.Pedido;
import io.swagger.mapper.PedidoMapper;
import io.swagger.repository.PedidoRepo;
import io.swagger.repository.entity.PedidoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PedidoServiceImpl implements PedidoService {

    @Autowired
    private PedidoMapper mapper;

    @Autowired
    private PedidoRepo repo;

    @Override
    public Pedido crearPedido(Pedido pedido) {
        PedidoEntity entity = mapper.dtoToEntity(pedido);
        entity = repo.save(entity);
        return mapper.entityToDto(entity);
    }
}


