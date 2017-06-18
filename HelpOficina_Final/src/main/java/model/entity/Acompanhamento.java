/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Fernando
 */
@Entity
@SequenceGenerator(name = "id_acomp", sequenceName = "seq_id_acomp", allocationSize = 1)
public class Acompanhamento implements Serializable {

    private OrdemServico ordemServico;
    
    private Integer idAcomp;
    private Date dataAdd;
    private String texto;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "id_acomp")
    public Integer getIdAcomp() {
        return idAcomp;
    }

    public void setIdAcomp(Integer idAcomp) {
        this.idAcomp = idAcomp;
    }

    @Temporal(TemporalType.TIMESTAMP)
    public Date getDataAdd() {
        return dataAdd;
    }

    public void setDataAdd(Date dataAdd) {
        this.dataAdd = dataAdd;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    @ManyToOne
    public OrdemServico getOrdemServico() {
        return ordemServico;
    }

    public void setOrdemServico(OrdemServico ordemServico) {
        this.ordemServico = ordemServico;
    }
    
    
    
}
