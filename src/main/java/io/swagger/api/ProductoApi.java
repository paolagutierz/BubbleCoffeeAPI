/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.27).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.annotations.*;
import io.swagger.dto.ProductoDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-04T19:53:55.066Z")

@Validated
@Api(value = "producto", description = "the producto API")
@RequestMapping(value = "/paolagutierz/BubbleCoffee/2.0.0")
public interface ProductoApi {

    @ApiOperation(value = "Agregar nuevo producto al Menu", nickname = "createProduct", notes = "Añadir producto al menu", response = ProductoDTO.class, tags={ "Producto", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "operacion exitosa", response = ProductoDTO.class),
        @ApiResponse(code = 405, message = "Entrada no valida") })
    @RequestMapping(value = "/producto",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<ProductoDTO> createProduct(@ApiParam(value = "Crear nuevo producto"  )  @Valid @RequestBody ProductoDTO productoItem);


    @ApiOperation(value = "Buscar productos por categoria", nickname = "findProductByCategory", notes = "Se puede agregar categoria separando los string con comas", response = ProductoDTO.class, responseContainer = "List", tags={ "Producto", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "operacion exitosa", response = ProductoDTO.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "no valido") })
    @RequestMapping(value = "/producto/findByCategory",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<ProductoDTO>> findProductByCategory(@NotNull @ApiParam(value = "Ver productos por categoria", required = true, allowableValues = "CAFE, BEBIDA, PANADERIA") @Valid @RequestParam(value = "category", required = true) List<String> category);


    @ApiOperation(value = "Buscar producto por ID", nickname = "productById", notes = "Retorna un solo producto", response = ProductoDTO.class, tags={ "Producto", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "operacion exitosa", response = ProductoDTO.class),
        @ApiResponse(code = 400, message = "id no valido"),
        @ApiResponse(code = 404, message = "producto no encontrado") })
    @RequestMapping(value = "/producto/{productId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<ProductoDTO> productById(@ApiParam(value = "Introduce el ID del producto",required=true) @PathVariable("productId") String productId);


    @ApiOperation(value = "Eliminar producto del menu", nickname = "productoProductIdDelete", notes = "Eliminar producto del menu", tags={ "Producto", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "pedido eliminado"),
        @ApiResponse(code = 404, message = "no encontrado") })
    @RequestMapping(value = "/producto/{productId}",
        consumes = { "application/json" },
        method = RequestMethod.DELETE)
    ResponseEntity<Void> productoProductIdDelete(@ApiParam(value = "eliminar producto",required=true) @PathVariable("productId") String productId);


    @ApiOperation(value = "cambiar o actualizar producto por ID", nickname = "productoProductIdPut", notes = "Actualizar producto", response = ProductoDTO.class, tags={ "Producto", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Producto actualizado", response = ProductoDTO.class),
        @ApiResponse(code = 404, message = "Not Found"),
        @ApiResponse(code = 405, message = "Metodo no permitido") })
    @RequestMapping(value = "/producto/{productId}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<ProductoDTO> productoProductIdPut(@ApiParam(value = "cambiar o actualizar producto por id",required=true) @PathVariable("productId") String productId,@ApiParam(value = "producto a actualizar"  )  @Valid @RequestBody ProductoDTO producto);

}
