package io.swagger.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.ApiParam;
import io.swagger.dto.Producto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.io.IOException;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-04T19:53:55.066Z")

@Controller
public class ProductoApiController implements ProductoApi {

    private static final Logger log = LoggerFactory.getLogger(ProductoApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ProductoApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<Producto>> createProduct(@ApiParam(value = "Crear nuevo producto") @Valid @RequestBody Producto productoItem) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Producto>>(objectMapper.readValue("{}", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Producto>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Producto>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Producto>> findProductByCategory(@NotNull @ApiParam(value = "Ver productos por categoria", required = true, allowableValues = "cafes, bebidas, panaderia") @Valid @RequestParam(value = "category", required = true) List<String> category) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Producto>>(objectMapper.readValue("{}", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Producto>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Producto>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Producto> getProducts() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Producto>(objectMapper.readValue("{\"empty\": false}", Producto.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Producto>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Producto>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Producto> productById(@ApiParam(value = "Introduce el ID del producto", required = true) @PathVariable("productId") String productId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Producto>(objectMapper.readValue("{\"empty\": false}", Producto.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Producto>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Producto>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Producto> productoProductIdDelete(@ApiParam(value = "eliminar producto", required = true) @PathVariable("productId") String productId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Producto>(objectMapper.readValue("{\"empty\": false}", Producto.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Producto>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Producto>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Producto> productoProductIdPut(@ApiParam(value = "cambiar o actualizar producto por id", required = true) @PathVariable("productId") String productId, @ApiParam(value = "producto a actualizar") @Valid @RequestBody Producto producto) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Producto>(objectMapper.readValue("{\"empty\": false}", Producto.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Producto>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Producto>(HttpStatus.NOT_IMPLEMENTED);
    }

}
