package io.swagger.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Objects;

/**
 * generar pago del pedido
 */
@ApiModel(description = "generar pago del pedido ")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-04T19:53:55.066Z")


public class PagoDTO {
    @JsonProperty("id")
    private String id = null;

    @JsonProperty("Pedido")
    private PedidoDTO pedidoDTO = null;

    @JsonProperty("nomCliente")
    private String nomCliente = null;

    @JsonProperty("cardNum")
    private String cardNum = null;

    @JsonProperty("expires")
    private String expires = null;

    @JsonProperty("costo")
    private BigDecimal costo = null;

    public PagoDTO id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     *
     * @return id
     **/
    @ApiModelProperty(value = "")


    public String getId() {
        return id;
    }

    @JsonIgnore
    public void setId(String id) {
        this.id = id;
    }

    public PagoDTO pedido(PedidoDTO pedidoDTO) {
        this.pedidoDTO = pedidoDTO;
        return this;
    }

    /**
     * Get pedido
     *
     * @return pedido
     **/
    @ApiModelProperty(value = "")

    @Valid

    public PedidoDTO getPedido() {
        return pedidoDTO;
    }

    public void setPedido(PedidoDTO pedidoDTO) {
        this.pedidoDTO = pedidoDTO;
    }

    public PagoDTO nomCliente(String nomCliente) {
        this.nomCliente = nomCliente;
        return this;
    }

    /**
     * Get nomCliente
     *
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

    public PagoDTO cardNum(String cardNum) {
        this.cardNum = cardNum;
        return this;
    }

    /**
     * Get cardNum
     *
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

    public PagoDTO expires(String expires) {

        this.expires = expires;
        return this;
    }

    /**
     * Get expires
     *
     * @return expires
     **/
    @ApiModelProperty(example = "07/07/2027", value = "")


    public String getExpires() {
        return expires;
    }

    public void setExpires(String expires) {
        this.expires = expires;
    }

    public PagoDTO costo(BigDecimal costo) {
        this.costo = costo;
        return this;
    }

    /**
     * Get costo
     *
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
        PagoDTO pagoDTO = (PagoDTO) o;
        return Objects.equals(this.id, pagoDTO.id) &&
                Objects.equals(this.pedidoDTO, pagoDTO.pedidoDTO) &&
                Objects.equals(this.nomCliente, pagoDTO.nomCliente) &&
                Objects.equals(this.cardNum, pagoDTO.cardNum) &&
                Objects.equals(this.expires, pagoDTO.expires) &&
                Objects.equals(this.costo, pagoDTO.costo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, pedidoDTO, nomCliente, cardNum, expires, costo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Pago {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    pedido: ").append(toIndentedString(pedidoDTO)).append("\n");
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

