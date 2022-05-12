package io.swagger.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
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
                Objects.equals(this.nomCliente, pagoDTO.nomCliente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, pedidoDTO, nomCliente);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Pago {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    pedido: ").append(toIndentedString(pedidoDTO)).append("\n");
        sb.append("    nomCliente: ").append(toIndentedString(nomCliente)).append("\n");
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

