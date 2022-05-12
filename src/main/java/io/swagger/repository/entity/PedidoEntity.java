package io.swagger.repository.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "pedido")
public class PedidoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToMany(mappedBy="pedidoEntity",cascade = CascadeType.ALL,
            orphanRemoval = true)
    private List<PedidoDetalleEntity> pedidoDetalleList;

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

    public List<PedidoDetalleEntity> getPedidoDetalleList() {
        return pedidoDetalleList;
    }

    public void setPedidoDetalleList(List<PedidoDetalleEntity> pedidoDetalleList) {
        this.pedidoDetalleList = pedidoDetalleList;
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








