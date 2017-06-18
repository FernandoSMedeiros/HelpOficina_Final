/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.UniqueConstraint;

/**
 *
 * @author Fernando
 */
@Entity
@SequenceGenerator (name = "id_pedido", sequenceName = "seq_id_os", allocationSize = 1)
public class Pedido implements Serializable  {
    
    private Integer idPedido;
    private String numeroPedido;
    private String codPeça;
    private String descricao;
    private Integer quant;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "id_pedido")
    public Integer getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Integer idPedido) {
        this.idPedido = idPedido;
    }

    public String getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(String numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public String getCodPeça() {
        return codPeça;
    }

    public void setCodPeça(String codPeça) {
        this.codPeça = codPeça;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getQuant() {
        return quant;
    }

    public void setQuant(Integer quant) {
        this.quant = quant;
    }
    
    
    
}
