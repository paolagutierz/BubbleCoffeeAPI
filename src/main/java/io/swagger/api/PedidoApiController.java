package io.swagger.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.ApiParam;
import io.swagger.dto.PagoDTO;
import io.swagger.dto.PedidoDTO;
import io.swagger.service.PagoService;
import io.swagger.service.PedidoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.ArrayList;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-11T02:16:01.140Z")

@Controller
public class PedidoApiController implements PedidoApi {

    private static final Logger log = LoggerFactory.getLogger(PedidoApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    private PedidoService pedidoService;

    private PagoService pagoService;

    @Autowired
    public PedidoApiController(ObjectMapper objectMapper, HttpServletRequest request, PedidoService pedidoService, PagoService pagoService) {
        this.objectMapper = objectMapper;
        this.request = request;
        this.pedidoService = pedidoService;
        this.pagoService=pagoService;
    }


    public ResponseEntity<PagoDTO> pagoPost(@ApiParam(value = "pedido id", required = true) @PathVariable("pedidoId") String pedidoId, @ApiParam(value = "pagar pedido") @Valid @RequestBody PagoDTO pagoDTO) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            PagoDTO pago = pagoService.crearPago(Integer.parseInt(pedidoId), pagoDTO);
            return new ResponseEntity<PagoDTO>(pago, HttpStatus.OK);
        }
        return new ResponseEntity<PagoDTO>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<PedidoDTO> pedidoPedidoIdDelete(
            @ApiParam(value = "pedido id", required = true) @PathVariable("pedidoId") String pedidoId) {
            String accept = request.getHeader("Accept");

            pedidoService.eliminarPedido(Integer.parseInt(pedidoId));

            return new ResponseEntity(HttpStatus.OK);
        }


    public ResponseEntity<PedidoDTO> pedidoPedidoIdGet(
            @ApiParam(value = "buscar pedido por id", required = true) @PathVariable("pedidoId") String pedidoId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            PedidoDTO pedido = pedidoService.obtenerPedidoPorId(Integer.parseInt(pedidoId));

            return new ResponseEntity(pedido, HttpStatus.OK);
        }

        return new ResponseEntity<PedidoDTO>(HttpStatus.NOT_IMPLEMENTED);
    }


    public ResponseEntity<PedidoDTO> pedidoPost(
            @ApiParam(value = "Agregar pedido") @Valid @RequestBody  ArrayList<Integer> productos) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            PedidoDTO pedido= pedidoService.crearPedido(productos);
            return new ResponseEntity<PedidoDTO>(pedido, HttpStatus.OK);
        }
        return new ResponseEntity<PedidoDTO>(HttpStatus.NOT_IMPLEMENTED);
    }
}
