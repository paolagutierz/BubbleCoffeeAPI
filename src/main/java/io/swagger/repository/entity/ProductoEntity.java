package io.swagger.repository.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "product")
public class ProductoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToMany(mappedBy="productoEntity",
            cascade = CascadeType.ALL,
            orphanRemoval = true,
             fetch=FetchType.LAZY)
    private List<PedidoDetalleEntity> pedidoDetalleList;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "categoria")
    private String categoria;

    @Column(name = "precio")
    private double precio;

    @Column(name = "disponibilidad")
    private String disponibilidad;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public List<PedidoDetalleEntity> getPedidoDetalleList() {
        return pedidoDetalleList;
    }

    public void setPedidoDetalleList(List<PedidoDetalleEntity> pedidoDetalleList) {
        this.pedidoDetalleList = pedidoDetalleList;
    }
}
