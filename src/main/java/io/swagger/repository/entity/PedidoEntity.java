package io.swagger.repository.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "pedido")
public class PedidoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToMany(cascade = CascadeType.ALL)
    private List<ProductoEntity> productos;

    @Column(name = "costoTotal")
    private double costoTotal;

    @Column(name = "estado")
    private String estado;

    @Column(name = "fecha")
    private String fecha;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<ProductoEntity> getProductos() {
        return productos;
    }

    public void setProductos(List<ProductoEntity> productoDTOS) {
        this.productos = productoDTOS;
    }

    public double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(double costoTotal) {
        this.costoTotal = costoTotal;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}








