package io.swagger.repository.entity;

import javax.persistence.*;

@Entity
@Table(name = "pago")
public class PagoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne
    private PedidoEntity pedido;

    @Column(name = "nomCliente")
    private String nomCliente;

    @Column(name = "cardNum")
    private double cardNum;

    @Column(name = "expires")
    private String expires;

    @Column(name = "costo")
    private double costo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public PedidoEntity getPedido() {
        return pedido;
    }

    public void setPedido(PedidoEntity pedido) {
        this.pedido = pedido;
    }

    public String getNomCliente() {
        return nomCliente;
    }

    public void setNomCliente(String nomCliente) {
        this.nomCliente = nomCliente;
    }

    public double getCardNum() {
        return cardNum;
    }

    public void setCardNum(double cardNum) {
        this.cardNum = cardNum;
    }

    public String getExpires() {
        return expires;
    }

    public void setExpires(String expires) {
        this.expires = expires;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
}
