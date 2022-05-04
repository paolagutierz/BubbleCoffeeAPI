package io.swagger.api;

import io.swagger.model.Producto;
import org.springframework.core.io.Resource;
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
public class ProductoApiController implements ProductoApi {

    private static final Logger log = LoggerFactory.getLogger(ProductoApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ProductoApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Producto> createProductWithForm(@ApiParam(value = "  Introduce el nombre del producto") @RequestParam(value="Nombre", required=false)  String nombre,@ApiParam(value = "Elige la categoria del producto", allowableValues="Cafes, Bebidas, Panaderia") @RequestParam(value="Categoria", required=false)  List<String> categoria,@ApiParam(value = "Introduce la descripcion del producto") @RequestParam(value="Descripcion", required=false)  String descripcion,@ApiParam(value = "Introduce el  precio del producto") @RequestParam(value="Precio", required=false)  String precio,@ApiParam(value = "Imagen del producto") @Valid @RequestPart(value="Imagen", required=false) MultipartFile Imagen) {
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

    public ResponseEntity<Void> deleteProduct(@ApiParam(value = "ID del producto a eliminar",required=true) @PathVariable("productId") Long productId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Producto> getProductById(@ApiParam(value = "Introduce el ID del producto",required=true) @PathVariable("productId") Long productId) {
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

    public ResponseEntity<Void> updateProductWithForm(@ApiParam(value = "Introduce el ID del producto a actualizar",required=true) @PathVariable("productId") Long productId,@ApiParam(value = "Modificar nombre del producto") @RequestParam(value="Nombre", required=false)  String nombre,@ApiParam(value = "Modificar descripcion del producto") @RequestParam(value="Descripcion", required=false)  String descripcion,@ApiParam(value = "Modificar disponibilidad del producto") @RequestParam(value="Disponibilidad", required=false)  String disponibilidad,@ApiParam(value = "Modificar precio del producto") @RequestParam(value="Precio", required=false)  String precio,@ApiParam(value = "Modificar imagen del producto") @Valid @RequestPart(value="Imagen", required=false) MultipartFile Imagen) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
