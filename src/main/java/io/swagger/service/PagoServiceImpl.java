package io.swagger.service;


import io.swagger.dto.PagoDTO;
import io.swagger.dto.PedidoDTO;
import io.swagger.mapper.PagoMapper;
import io.swagger.repository.PagoRepo;
import io.swagger.repository.PedidoRepo;
import io.swagger.repository.entity.PagoEntity;
import io.swagger.repository.entity.PedidoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PagoServiceImpl implements PagoService {

    @Autowired
    private PagoMapper mapper;

    @Autowired
    private PagoRepo pagoRepo;

    @Autowired
    private PedidoRepo pedidoRepo;



    @Override
    public PagoDTO crearPago(int id, PagoDTO pagoDTO) {
        PagoEntity pagoEntity = mapper.dtoToEntity(pagoDTO);
        PedidoEntity pedidoEntity= pedidoRepo.findOne(id);
         pedidoEntity.setEstado(PedidoDTO.EstadoEnum.COMPLETADO.name());
         pagoEntity.setPedido(pedidoEntity);
         pagoEntity = pagoRepo.save(pagoEntity);
        return mapper.entityToDto(pagoEntity);
    }
}


