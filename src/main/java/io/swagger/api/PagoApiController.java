package io.swagger.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.ApiParam;
import io.swagger.dto.PagoDTO;
import io.swagger.service.PagoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-04T19:53:55.066Z")

@Controller
public class PagoApiController implements PagoApi {

    private static final Logger log = LoggerFactory.getLogger(PedidoApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    private PagoService pagoService;

    @org.springframework.beans.factory.annotation.Autowired
    public PagoApiController(ObjectMapper objectMapper, HttpServletRequest request, PagoService pagoService) {
        this.objectMapper = objectMapper;
        this.request = request;
        this.pagoService = pagoService;
    }

    public ResponseEntity<PagoDTO> PagoPost(@ApiParam(value = "pedido id", required = true) @PathVariable("pedidoId") String pedidoId, @ApiParam(value = "pagar pedido") @Valid @RequestBody PagoDTO pagoDTO) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            PagoDTO pago= pagoService.crearPago(pagoDTO);
            return new ResponseEntity<PagoDTO>(pago, HttpStatus.OK);
        }
        return new ResponseEntity<PagoDTO>(HttpStatus.NOT_IMPLEMENTED);
    }


}

