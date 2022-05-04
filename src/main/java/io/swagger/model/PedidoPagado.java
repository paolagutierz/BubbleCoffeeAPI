package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Pago;
import io.swagger.model.PedidoBase;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Pedido Pagado
 */
@ApiModel(description = "Pedido Pagado")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-04T01:06:32.009Z")


public class PedidoPagado   {
  @JsonProperty("pedidoBase")
  private PedidoBase pedidoBase = null;

  @JsonProperty("pago")
  private Pago pago = null;

  @JsonProperty("links")
  @Valid
  private List<Object> links = null;

  public PedidoPagado pedidoBase(PedidoBase pedidoBase) {
    this.pedidoBase = pedidoBase;
    return this;
  }

  /**
   * Get pedidoBase
   * @return pedidoBase
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PedidoBase getPedidoBase() {
    return pedidoBase;
  }

  public void setPedidoBase(PedidoBase pedidoBase) {
    this.pedidoBase = pedidoBase;
  }

  public PedidoPagado pago(Pago pago) {
    this.pago = pago;
    return this;
  }

  /**
   * Get pago
   * @return pago
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Pago getPago() {
    return pago;
  }

  public void setPago(Pago pago) {
    this.pago = pago;
  }

  public PedidoPagado links(List<Object> links) {
    this.links = links;
    return this;
  }

  public PedidoPagado addLinksItem(Object linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<Object>();
    }
    this.links.add(linksItem);
    return this;
  }

  /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")


  public List<Object> getLinks() {
    return links;
  }

  public void setLinks(List<Object> links) {
    this.links = links;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PedidoPagado pedidoPagado = (PedidoPagado) o;
    return Objects.equals(this.pedidoBase, pedidoPagado.pedidoBase) &&
        Objects.equals(this.pago, pedidoPagado.pago) &&
        Objects.equals(this.links, pedidoPagado.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pedidoBase, pago, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PedidoPagado {\n");
    
    sb.append("    pedidoBase: ").append(toIndentedString(pedidoBase)).append("\n");
    sb.append("    pago: ").append(toIndentedString(pago)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

