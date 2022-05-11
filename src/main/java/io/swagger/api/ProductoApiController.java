package io.swagger.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.ApiParam;
import io.swagger.dto.ProductoDTO;
import io.swagger.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-04T19:53:55.066Z")

@Controller
public class ProductoApiController implements ProductoApi {

    private ProductService productService;

    private static final Logger log = LoggerFactory.getLogger(ProductoApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @Autowired
    public ProductoApiController(ObjectMapper objectMapper, HttpServletRequest request, ProductService service) {
        this.objectMapper = objectMapper;
        this.request = request;
        this.productService = service;
    }

    public ResponseEntity<ProductoDTO> createProduct(
            @ApiParam(value = "Crear nuevo producto") @Valid @RequestBody ProductoDTO productoItem) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            // llamar el servicio para realiar la accion y obtener respuesta
            ProductoDTO nuevoProducto = productService.crearProducto(productoItem);
            // devolver data con el codigo correspondiente
            return new ResponseEntity(nuevoProducto, HttpStatus.CREATED);
        }

        return new ResponseEntity(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<ProductoDTO>> findProductByCategory(
            @NotNull @ApiParam(value = "Ver productos por categoria", required = true, allowableValues = "CAFE, BEBIDA, PANADERIA") @Valid @RequestParam(value = "category", required = true) List<String> category) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            // llamo al servicio y obtengo la lista
            List<ProductoDTO> productos = productService.obtenerProductosPorCategoria(category);

            return new ResponseEntity(productos, HttpStatus.OK);
        }

        return new ResponseEntity(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ProductoDTO> productById(
            @ApiParam(value = "Introduce el ID del producto", required = true) @PathVariable("productId") String productId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            ProductoDTO producto = productService.obtenerProductoPorId(Integer.parseInt(productId));

            return new ResponseEntity(producto, HttpStatus.OK);
        }

        return new ResponseEntity<ProductoDTO>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> productoProductIdDelete(
            @ApiParam(value = "eliminar producto", required = true) @PathVariable("productId") String productId) {
        String accept = request.getHeader("Accept");

        productService.eliminarProducto(Integer.parseInt(productId));

        return new ResponseEntity(HttpStatus.OK);
    }

    public ResponseEntity<ProductoDTO> productoProductIdPut(
            @ApiParam(value = "cambiar o actualizar producto por id", required = true) @PathVariable("productId") String productId,
            @ApiParam(value = "producto a actualizar") @Valid @RequestBody ProductoDTO producto) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            productService.modificarProducto(Integer.parseInt(productId), producto);
            return new ResponseEntity(HttpStatus.OK);

        }

        return new ResponseEntity<ProductoDTO>(HttpStatus.NOT_IMPLEMENTED);
    }

}
