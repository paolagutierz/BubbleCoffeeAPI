package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Menu;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * propiedades base de pedido.
 */
@ApiModel(description = "propiedades base de pedido.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-04T01:06:32.009Z")


public class PedidoBase   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("productos")
  @Valid
  private List<Menu> productos = null;

  @JsonProperty("costoTotal")
  private BigDecimal costoTotal = null;

  /**
   * Gets or Sets estado
   */
  public enum EstadoEnum {
    CREADO("Creado"),
    
    PAGADO("Pagado"),
    
    CANCELADO("Cancelado"),
    
    COMPLETO("Completo");

    private String value;

    EstadoEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static EstadoEnum fromValue(String text) {
      for (EstadoEnum b : EstadoEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("estado")
  private EstadoEnum estado = null;

  @JsonProperty("fecha")
  private String fecha = null;

  public PedidoBase id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PedidoBase productos(List<Menu> productos) {
    this.productos = productos;
    return this;
  }

  public PedidoBase addProductosItem(Menu productosItem) {
    if (this.productos == null) {
      this.productos = new ArrayList<Menu>();
    }
    this.productos.add(productosItem);
    return this;
  }

  /**
   * Get productos
   * @return productos
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Menu> getProductos() {
    return productos;
  }

  public void setProductos(List<Menu> productos) {
    this.productos = productos;
  }

  public PedidoBase costoTotal(BigDecimal costoTotal) {
    this.costoTotal = costoTotal;
    return this;
  }

  /**
   * Costo total del pedido
   * @return costoTotal
  **/
  @ApiModelProperty(value = "Costo total del pedido")

  @Valid

  public BigDecimal getCostoTotal() {
    return costoTotal;
  }

  public void setCostoTotal(BigDecimal costoTotal) {
    this.costoTotal = costoTotal;
  }

  public PedidoBase estado(EstadoEnum estado) {
    this.estado = estado;
    return this;
  }

  /**
   * Get estado
   * @return estado
  **/
  @ApiModelProperty(value = "")


  public EstadoEnum getEstado() {
    return estado;
  }

  public void setEstado(EstadoEnum estado) {
    this.estado = estado;
  }

  public PedidoBase fecha(String fecha) {
    this.fecha = fecha;
    return this;
  }

  /**
   * Get fecha
   * @return fecha
  **/
  @ApiModelProperty(value = "")


  public String getFecha() {
    return fecha;
  }

  public void setFecha(String fecha) {
    this.fecha = fecha;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PedidoBase pedidoBase = (PedidoBase) o;
    return Objects.equals(this.id, pedidoBase.id) &&
        Objects.equals(this.productos, pedidoBase.productos) &&
        Objects.equals(this.costoTotal, pedidoBase.costoTotal) &&
        Objects.equals(this.estado, pedidoBase.estado) &&
        Objects.equals(this.fecha, pedidoBase.fecha);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, productos, costoTotal, estado, fecha);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PedidoBase {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    productos: ").append(toIndentedString(productos)).append("\n");
    sb.append("    costoTotal: ").append(toIndentedString(costoTotal)).append("\n");
    sb.append("    estado: ").append(toIndentedString(estado)).append("\n");
    sb.append("    fecha: ").append(toIndentedString(fecha)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

