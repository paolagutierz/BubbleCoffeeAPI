package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Menu
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-04T01:06:32.009Z")


public class Menu   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("nombre")
  private String nombre = null;

  /**
   * Gets or Sets categoria
   */
  public enum CategoriaEnum {
    CAFES("Cafes"),
    
    BEBIDAS("Bebidas"),
    
    PANADERIA("Panaderia");

    private String value;

    CategoriaEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CategoriaEnum fromValue(String text) {
      for (CategoriaEnum b : CategoriaEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("categoria")
  private CategoriaEnum categoria = null;

  @JsonProperty("precio")
  private BigDecimal precio = null;

  @JsonProperty("photoUrls")
  @Valid
  private List<String> photoUrls = new ArrayList<String>();

  /**
   * Disponibilidad de productos
   */
  public enum DisponibilidadEnum {
    DISPONIBLE("disponible"),
    
    AGOTADO("agotado");

    private String value;

    DisponibilidadEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DisponibilidadEnum fromValue(String text) {
      for (DisponibilidadEnum b : DisponibilidadEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("disponibilidad")
  private DisponibilidadEnum disponibilidad = null;

  public Menu id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Menu nombre(String nombre) {
    this.nombre = nombre;
    return this;
  }

  /**
   * Get nombre
   * @return nombre
  **/
  @ApiModelProperty(value = "")


  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public Menu categoria(CategoriaEnum categoria) {
    this.categoria = categoria;
    return this;
  }

  /**
   * Get categoria
   * @return categoria
  **/
  @ApiModelProperty(value = "")


  public CategoriaEnum getCategoria() {
    return categoria;
  }

  public void setCategoria(CategoriaEnum categoria) {
    this.categoria = categoria;
  }

  public Menu precio(BigDecimal precio) {
    this.precio = precio;
    return this;
  }

  /**
   * Get precio
   * @return precio
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getPrecio() {
    return precio;
  }

  public void setPrecio(BigDecimal precio) {
    this.precio = precio;
  }

  public Menu photoUrls(List<String> photoUrls) {
    this.photoUrls = photoUrls;
    return this;
  }

  public Menu addPhotoUrlsItem(String photoUrlsItem) {
    this.photoUrls.add(photoUrlsItem);
    return this;
  }

  /**
   * Get photoUrls
   * @return photoUrls
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public List<String> getPhotoUrls() {
    return photoUrls;
  }

  public void setPhotoUrls(List<String> photoUrls) {
    this.photoUrls = photoUrls;
  }

  public Menu disponibilidad(DisponibilidadEnum disponibilidad) {
    this.disponibilidad = disponibilidad;
    return this;
  }

  /**
   * Disponibilidad de productos
   * @return disponibilidad
  **/
  @ApiModelProperty(value = "Disponibilidad de productos")


  public DisponibilidadEnum getDisponibilidad() {
    return disponibilidad;
  }

  public void setDisponibilidad(DisponibilidadEnum disponibilidad) {
    this.disponibilidad = disponibilidad;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Menu menu = (Menu) o;
    return Objects.equals(this.id, menu.id) &&
        Objects.equals(this.nombre, menu.nombre) &&
        Objects.equals(this.categoria, menu.categoria) &&
        Objects.equals(this.precio, menu.precio) &&
        Objects.equals(this.photoUrls, menu.photoUrls) &&
        Objects.equals(this.disponibilidad, menu.disponibilidad);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nombre, categoria, precio, photoUrls, disponibilidad);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Menu {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nombre: ").append(toIndentedString(nombre)).append("\n");
    sb.append("    categoria: ").append(toIndentedString(categoria)).append("\n");
    sb.append("    precio: ").append(toIndentedString(precio)).append("\n");
    sb.append("    photoUrls: ").append(toIndentedString(photoUrls)).append("\n");
    sb.append("    disponibilidad: ").append(toIndentedString(disponibilidad)).append("\n");
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

