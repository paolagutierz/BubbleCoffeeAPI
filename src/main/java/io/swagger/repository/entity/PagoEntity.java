package io.swagger.repository.entity;

import org.hibernate.mapping.List;

import javax.persistence.*;


    @Entity
    @Table(name = "pago")
    public class PagoEntity {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;

        @Column(name = "pedido")
        private   pedido;

        @Column(name = "nomCliente")
        private String nomCliente;

        @Column(name = "cardNum")
        private Double cardNum;

        @Column(name = "expires")
        private Integer expires;

        @Column(name = "costo")
        private Integer costo;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getPedido() {
            return pedido;
        }

        public void setPedido(String pedido) {
            this.pedido = pedido;
        }

        public String getNomCliente() {
            return nomCliente;
        }

        public void setNomCliente(String nomCliente) {
            this.nomCliente = nomCliente;
        }

        public Double getCardNum() {
            return cardNum;
        }

        public void setCardNum(Double cardNum) {
            this.cardNum = cardNum;
        }

        public Integer getExpires() {
            return expires;
        }

        public void setExpires(Integer expires) {
            this.expires = expires;
        }

        public Integer getCosto() {
            return costo;
        }

        public void setCosto(Integer costo) {
            this.costo = costo;
        }
    }