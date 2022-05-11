package io.swagger.api;

import io.swagger.annotations.*;
import io.swagger.dto.PagoDTO;
import io.swagger.dto.PedidoDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-04T19:53:55.066Z")

@Validated
@Api(value = "pago", description = "the pedido API")
@RequestMapping(value = "/v2")

public interface PagoApi {

        @ApiOperation(value = "Pagar pedido", nickname = "PagoPost", notes = "obtener el pedido por Id para pagarlo", response = PedidoDTO.class, tags = {
                        "Pedido", })
        @ApiResponses(value = {
                        @ApiResponse(code = 200, message = "Pedido pagado", response = PedidoDTO.class),
                        @ApiResponse(code = 400, message = "entrada no valida"),
                        @ApiResponse(code = 409, message = "pago duplicado") })
        @RequestMapping(value = "/pedido/pago/{pedidoId}", produces = { "application/json" }, consumes = {
                        "application/json" }, method = RequestMethod.POST)
        ResponseEntity<PagoDTO> PagoPost(
                        @ApiParam(value = "pedido id", required = true) @PathVariable("pedidoId") String pedidoId,
                        @ApiParam(value = "pagar pedido") @Valid @RequestBody PagoDTO pagoDTO);

}
