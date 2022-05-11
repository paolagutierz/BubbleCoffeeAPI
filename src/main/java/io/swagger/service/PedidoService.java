package io.swagger.service;

import io.swagger.dto.PedidoDTO;

import java.util.List;

public interface PedidoService {

    PedidoDTO crearPedido(List<Integer> productos);

    void eliminarPedido(int id);

    PedidoDTO obtenerPedidoPorId(int id);

    PedidoDTO modificarPedido(int id, List<Integer>productos);

    List<PedidoDTO>verEstadoDePedido(List<String> id);




}
