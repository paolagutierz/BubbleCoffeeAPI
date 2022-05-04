package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Pedido;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * generar pago del pedido 
 */
@ApiModel(description = "generar pago del pedido ")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-04T19:53:55.066Z")


public class Pago   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("Pedido")
  private Pedido pedido = null;

  @JsonProperty("nomCliente")
  private String nomCliente = null;

  @JsonProperty("cardNum")
  private String cardNum = null;

  @JsonProperty("expires")
  private String expires = null;

  @JsonProperty("costo")
  private BigDecimal costo = null;

  public Pago id(String id) {
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

  public Pago pedido(Pedido pedido) {
    this.pedido = pedido;
    return this;
  }

  /**
   * Get pedido
   * @return pedido
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Pedido getPedido() {
    return pedido;
  }

  public void setPedido(Pedido pedido) {
    this.pedido = pedido;
  }

  public Pago nomCliente(String nomCliente) {
    this.nomCliente = nomCliente;
    return this;
  }

  /**
   * Get nomCliente
   * @return nomCliente
  **/
  @ApiModelProperty(example = "Lucy", required = true, value = "")
  @NotNull


  public String getNomCliente() {
    return nomCliente;
  }

  public void setNomCliente(String nomCliente) {
    this.nomCliente = nomCliente;
  }

  public Pago cardNum(String cardNum) {
    this.cardNum = cardNum;
    return this;
  }

  /**
   * Get cardNum
   * @return cardNum
  **/
  @ApiModelProperty(example = "000000", required = true, value = "")
  @NotNull


  public String getCardNum() {
    return cardNum;
  }

  public void setCardNum(String cardNum) {
    this.cardNum = cardNum;
  }

  public Pago expires(String expires) {
    this.expires = expires;
    return this;
  }

  /**
   * Get expires
   * @return expires
  **/
  @ApiModelProperty(example = "07/07/2027", value = "")


  public String getExpires() {
    return expires;
  }

  public void setExpires(String expires) {
    this.expires = expires;
  }

  public Pago costo(BigDecimal costo) {
    this.costo = costo;
    return this;
  }

  /**
   * Get costo
   * @return costo
  **/
  @ApiModelProperty(example = "25.0", value = "")

  @Valid

  public BigDecimal getCosto() {
    return costo;
  }

  public void setCosto(BigDecimal costo) {
    this.costo = costo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Pago pago = (Pago) o;
    return Objects.equals(this.id, pago.id) &&
        Objects.equals(this.pedido, pago.pedido) &&
        Objects.equals(this.nomCliente, pago.nomCliente) &&
        Objects.equals(this.cardNum, pago.cardNum) &&
        Objects.equals(this.expires, pago.expires) &&
        Objects.equals(this.costo, pago.costo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, pedido, nomCliente, cardNum, expires, costo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pago {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    pedido: ").append(toIndentedString(pedido)).append("\n");
    sb.append("    nomCliente: ").append(toIndentedString(nomCliente)).append("\n");
    sb.append("    cardNum: ").append(toIndentedString(cardNum)).append("\n");
    sb.append("    expires: ").append(toIndentedString(expires)).append("\n");
    sb.append("    costo: ").append(toIndentedString(costo)).append("\n");
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

