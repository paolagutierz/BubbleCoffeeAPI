package io.swagger.service;

import io.swagger.dto.PagoDTO;

public interface PagoService {

    PagoDTO crearPago(int id, PagoDTO pagoDTO);
}
