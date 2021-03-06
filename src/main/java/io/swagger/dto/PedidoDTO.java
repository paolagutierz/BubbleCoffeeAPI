package io.swagger.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * pedido.
 */
@ApiModel(description = "pedido")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-04T19:53:55.066Z")

public class PedidoDTO {
    @JsonProperty("id")
    private String id = null;

    @JsonProperty("productos")
    @Valid
    private List<ProductoDTO> productoDTOS = null;

    @JsonProperty("costoTotal")
    private BigDecimal costoTotal = null;

    /**
     * Gets or Sets estado
     */
    public enum EstadoEnum {
        CREADO("Creado"),

        PAGADO("Pagado"),

        CANCELADO("Cancelado"),

        COMPLETADO("Completado");

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

    public PedidoDTO id(String id) {
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

    public PedidoDTO productos(List<ProductoDTO> productoDTOS) {
        this.productoDTOS = productoDTOS;
        return this;
    }

    public PedidoDTO addProductosItem(ProductoDTO productosItem) {
        if (this.productoDTOS == null) {
            this.productoDTOS = new ArrayList<ProductoDTO>();
        }
        this.productoDTOS.add(productosItem);
        return this;
    }

    /**
     * Get productos
     *
     * @return productos
     **/
    @ApiModelProperty(value = "")

    @Valid

    public List<ProductoDTO> getProductos() {
        return productoDTOS;
    }

    public void setProductos(List<ProductoDTO> productoDTOS) {
        this.productoDTOS = productoDTOS;
    }

    public PedidoDTO costoTotal(BigDecimal costoTotal) {
        this.costoTotal = costoTotal;
        return this;
    }

    /**
     * Costo total del pedido
     *
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

    public PedidoDTO estado(EstadoEnum estado) {
        this.estado = estado;
        return this;
    }

    /**
     * Get estado
     *
     * @return estado
     **/
    @ApiModelProperty(value = "")

    public EstadoEnum getEstado() {
        return estado;
    }

    public void setEstado(EstadoEnum estado) {
        this.estado = estado;
    }

    public PedidoDTO fecha(String fecha) {
        this.fecha = fecha;
        return this;
    }

    /**
     * Get fecha
     *
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
        PedidoDTO pedidoDTO = (PedidoDTO) o;
        return Objects.equals(this.id, pedidoDTO.id) &&
                Objects.equals(this.productoDTOS, pedidoDTO.productoDTOS) &&
                Objects.equals(this.costoTotal, pedidoDTO.costoTotal) &&
                Objects.equals(this.estado, pedidoDTO.estado) &&
                Objects.equals(this.fecha, pedidoDTO.fecha);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, productoDTOS, costoTotal, estado, fecha);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Pedido {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    productos: ").append(toIndentedString(productoDTOS)).append("\n");
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
