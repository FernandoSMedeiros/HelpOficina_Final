/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entity;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


/**
 *
 * @author Fernando
 */
@Entity
public class Orcamento implements Serializable {

    private OrdemServico ordemServico;
    
    private Integer id_orcamento;
    
    private Date dataOrcamento;
    private Date DataExpiracao;
    private String Status;
    private double maoDeObra;
    
    @Id
    public Integer getId_orcamento() {
        return id_orcamento;
    }

    public void setId_orcamento(Integer id_orcamento) {
        this.id_orcamento = id_orcamento;
    }

    public Date getDataOrcamento() {
        return dataOrcamento;
    }

    public void setDataOrcamento(Date dataOrcamento) {
        this.dataOrcamento = dataOrcamento;
    }

    public Date getDataExpiracao() {
        return DataExpiracao;
    }

    public void setDataExpiracao(Date DataExpiracao) {
        this.DataExpiracao = DataExpiracao;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public double getMaoDeObra() {
        return maoDeObra;
    }

    public void setMaoDeObra(double maoDeObra) {
        this.maoDeObra = maoDeObra;
    }
    
    @ManyToOne
    public OrdemServico getOrdemServico() {
        return ordemServico;
    }

    public void setOrdemServico(OrdemServico ordemServico) {
        this.ordemServico = ordemServico;
    }
    
    
    
    
}
