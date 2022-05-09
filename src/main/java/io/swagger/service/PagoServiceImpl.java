package io.swagger.service;


import io.swagger.dto.PagoDTO;
import io.swagger.mapper.PagoMapper;
import io.swagger.repository.PagoRepo;
import io.swagger.repository.entity.PagoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PagoServiceImpl implements PagoService {

    @Autowired
    private PagoMapper mapper;

    @Autowired
    private PagoRepo repo;

    @Override
    public PagoDTO crearPago(PagoDTO pagoDTO) {
        PagoEntity entity = mapper.dtoToEntity(pagoDTO);
        entity = repo.save(entity);
        return mapper.entityToDto(entity);
    }
}


