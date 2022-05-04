package io.swagger.api;

import io.swagger.model.Pago;
import io.swagger.model.Pedido;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-04T03:17:15.009Z")

@Controller
public class PedidoApiController implements PedidoApi {

    private static final Logger log = LoggerFactory.getLogger(PedidoApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public PedidoApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Pedido> pedidoCompletadoPedidoIdPut(@ApiParam(value = "pedido id",required=true) @PathVariable("pedidoId") String pedidoId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Pedido>(objectMapper.readValue("{\"empty\": false}", Pedido.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Pedido>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Pedido>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Pedido> pedidoDetallePedidoIdGet(@ApiParam(value = "ver detalle de pedido para producirlo",required=true) @PathVariable("pedidoId") String pedidoId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Pedido>(objectMapper.readValue("{\"empty\": false}", Pedido.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Pedido>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Pedido>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Pedido> pedidoPagoPedidoIdPost(@ApiParam(value = "pedido id",required=true) @PathVariable("pedidoId") String pedidoId,@ApiParam(value = "pagar pedido"  )  @Valid @RequestBody Pago pago) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Pedido>(objectMapper.readValue("{\"empty\": false}", Pedido.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Pedido>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Pedido>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Pedido> pedidoPedidoIdDelete(@ApiParam(value = "pedido id",required=true) @PathVariable("pedidoId") String pedidoId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Pedido>(objectMapper.readValue("{\"empty\": false}", Pedido.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Pedido>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Pedido>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Pedido> pedidoPedidoIdGet(@ApiParam(value = "pedido id",required=true) @PathVariable("pedidoId") String pedidoId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Pedido>(objectMapper.readValue("{\"empty\": false}", Pedido.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Pedido>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Pedido>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Pedido> pedidoPedidoIdPut(@ApiParam(value = "cambiar o actualizar pedido por id",required=true) @PathVariable("pedidoId") String pedidoId,@ApiParam(value = "pedido a actualizar"  )  @Valid @RequestBody Pedido pedido) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Pedido>(objectMapper.readValue("{\"empty\": false}", Pedido.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Pedido>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Pedido>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Pedido> pedidoPost(@ApiParam(value = "Agregar pedido"  )  @Valid @RequestBody Pedido pedido) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Pedido>(objectMapper.readValue("{\"empty\": false}", Pedido.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Pedido>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Pedido>(HttpStatus.NOT_IMPLEMENTED);
    }

}
